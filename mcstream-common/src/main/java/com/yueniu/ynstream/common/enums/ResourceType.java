/**
 * 
 */
package com.yueniu.ynstream.common.enums;

/**
 * 
 * @author yuhui.tang  
 * 资源类型
 */
public enum ResourceType {
	// 1:文章,2:图文,3:音频 4:视频
	ResourceType_Article(1,"文章"),
	ResourceType_Photo(2,"图文"),
	ResourceType_Audio (3,"音频"),
	ResourceType_Video(4,"视频");
	
	private int type;
	
	private String value;

	private ResourceType(int type, String value) {
		this.type = type;
		this.value = value;
	}
	
	
	public static ResourceType getResourceType(int type){
		for(ResourceType ResourceType :ResourceType.values()){
			if(ResourceType.getType() == type){
				return ResourceType;
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

