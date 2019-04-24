/**
 * 
 */
package com.yueniu.ynstream.common.enums;

/**
 * 
 * @author yuhui.tang  
 * 跳转类型
 */
public enum JumpType {
	//1:外部链接,2:内部链接3:内部应用
	JumpType_ExternalLink(1,"外部链接"),
	JumpType_InnerLink(2,"内部链接"),
	JumpType_App(3,"内部应用");
	
	private int type;
	
	private String value;

	private JumpType(int type, String value) {
		this.type = type;
		this.value = value;
	}
	
	
	public static JumpType getJumpType(int type){
		for(JumpType JumpType :JumpType.values()){
			if(JumpType.getType() == type){
				return JumpType;
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

