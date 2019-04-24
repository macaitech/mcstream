/**
 * 
 */
package com.macaitech.mcstream.push;


import com.alibaba.fastjson.JSONObject;
import com.macaitech.mcstream.common.bo.StreamCommandData;

/**
 * @author yuhui.tang
 * 推送服务
 */
public class PushService {
	
	private LocalQueueService queueService;
	
	private static volatile PushService  instance;
	
	private PushService() {
	}
	
	public static PushService getInstance(String queueDataPath){
		if(instance == null){
			synchronized (LocalQueueService.class) {
				if(instance == null){
					instance = new PushService();
					instance.queueService = LocalQueueService.getInstance(queueDataPath);
				}
			}
		}
		return instance;
	}

	/**
	 * 推送
	 * @param commandData
	 * @return
	 */
	public boolean push(StreamCommandData commandData) {
		String json = JSONObject.toJSONString(commandData);
		this.queueService.push(json);
		return false;
	}
	
}
