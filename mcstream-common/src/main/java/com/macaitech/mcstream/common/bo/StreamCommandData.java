/**
 * 
 */
package com.macaitech.mcstream.common.bo;

import com.macaitech.mcstream.common.enums.DataCommandType;

/**
 * @author yuhui.tang
 * 信息流數據含命令
 */
public class StreamCommandData {
	
	private int commandType;
	
	private StreamContent streamContent;

	public StreamCommandData(DataCommandType commandType, StreamContent streamContent) {
		super();
		this.commandType = commandType.getType();
		this.streamContent = streamContent;
	}

	public int getCommandType() {
		return commandType;
	}

	public StreamContent getStreamContent() {
		return streamContent;
	}
	
	
	
}
