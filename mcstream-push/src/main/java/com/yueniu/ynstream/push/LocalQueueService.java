/**
 * 
 */
package com.yueniu.ynstream.push;

import java.io.IOException;

import com.github.cgdon.fqueue.FQueue;
import com.github.cgdon.fqueue.exception.FileFormatException;
import com.yueniu.ynstream.common.exception.CustomException;

/**
 * @author yuhui.tang
 * 本地隊列
 */
public class LocalQueueService {

	private static volatile LocalQueueService  instance;
	
	private FQueue fQueue;
	
	private LocalQueueService() {
		
	}
	
	private void initQueue(String queueDataPath) {
		try {
			fQueue = new FQueue(queueDataPath);
		} catch (IOException | FileFormatException e) {
			throw new CustomException(e);
		}
	}
	
	public static LocalQueueService getInstance(String queueDataPath){
		
		if(instance == null){
			synchronized (LocalQueueService.class) {
				if(instance == null){
					instance = new LocalQueueService();
					instance.initQueue(queueDataPath);
				}
			}
		}
		return instance;
	}
	
	/**
	 * 推送數據
	 * @param jsonObject
	 * @return
	 */
	public boolean push(String jsonObject) {
		boolean successed = this.fQueue.add(jsonObject.getBytes());
		return successed;
	}
	/**
	 * 提取并删除数据
	 * @return
	 */
	public String poll() {
		byte[] data = this.fQueue.poll();
		if(data!=null) {
			return new String(data);
		}
		return null;
	}
}
