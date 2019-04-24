/**
 * 
 */
package com.yueniu.ynstream.common.enums;

/**
 * 
 * @author yuhui.tang  
 * 信息流内容类型
 */
public enum ContentType {
	//1:资讯 2:约牛号 3:观点
	ContentType_Article(1,"资讯"),
	ContentType_YueNiuHao(2,"约牛号"),
	ContentType_Opinion(3,"观点");
	
	private int type;
	
	private String value;

	private ContentType(int type, String value) {
		this.type = type;
		this.value = value;
	}
	
	
	public static ContentType getContentType(int type){
		for(ContentType ContentType :ContentType.values()){
			if(ContentType.getType() == type){
				return ContentType;
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

