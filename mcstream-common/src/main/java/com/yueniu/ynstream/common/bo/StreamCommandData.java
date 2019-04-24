/**
 * 
 */
package com.yueniu.ynstream.common.bo;

import com.yueniu.ynstream.common.enums.DataCommandType;

/**
 * @author yuhui.tang
 * 信息流數據含命令
 */
public class StreamCommandData {
	
	private DataCommandType commandType;
	
	private StreamContent streamContent;

	public StreamCommandData(DataCommandType commandType, StreamContent streamContent) {
		super();
		this.commandType = commandType;
		this.streamContent = streamContent;
	}

	public DataCommandType getCommandType() {
		return commandType;
	}

	public StreamContent getStreamContent() {
		return streamContent;
	}
	
	
	
}
