/**
 * 
 */
package com.yueniu.ynstream.common.enums;

/**
 * 
 * @author yuhui.tang  
 * 數據命令类型
 */
public enum DataCommandType {
	//1:新增,2:更新3:刪除
	DataCommandType_Insert(1,"新增"),
	DataCommandType_Update(2,"更新"),
	DataCommandType_Delete(3,"刪除");
	
	private int type;
	
	private String value;

	private DataCommandType(int type, String value) {
		this.type = type;
		this.value = value;
	}
	
	
	public static DataCommandType getDataCommandType(int type){
		for(DataCommandType dataCommandType :DataCommandType.values()){
			if(dataCommandType.getType() == type){
				return dataCommandType;
			}
		}
		return null;
	}
	
	public int getType() {
		return type;
	}

	public String getValue() {
		return value;
	}
}

