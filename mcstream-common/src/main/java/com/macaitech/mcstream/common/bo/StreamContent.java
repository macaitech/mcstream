/**
 * 
 */
package com.macaitech.mcstream.common.bo;

/**
 * @author 唐玉辉
 * 信息流内容实体
 */
public class StreamContent {

	private String streamId;//信息流Id
	
	private String contentId;//内容源Id
	private int contentType;//内容源类型 1:资讯 2:约牛号 3:观点
	
	private String title;//内容标题
	private long contentTime;//时间
	
	private boolean top;//是否置顶
	private int jumpType;//跳转类型 1:外部链接,2:内部链接3:内部应用
	private String jumpParameter;//跳转参数
	
	private int resourceType;//资源类型 1:文章,2:图文,3:音频 4:视频
	
	private String resourceURL;//资源地址
	
	public StreamContent( int contentType,String contentId) {
		super();
		this.contentId = contentId;
		this.contentType = contentType;
		this.streamId = this.contentType+"-"+this.contentId;
	}

	public String getStreamId() {
		return streamId;
	}

	public StreamContent setStreamId(String streamId) {
		this.streamId = streamId;
		return this;
	}

	public String getContentId() {
		return contentId;
	}

	public StreamContent setContentId(String contentId) {
		this.contentId = contentId;
		return this;
	}

	public int getContentType() {
		return contentType;
	}

	public StreamContent setContentType(int contentType) {
		this.contentType = contentType;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public StreamContent setTitle(String title) {
		this.title = title;
		return this;
	}

	public long getContentTime() {
		return contentTime;
	}

	public StreamContent setContentTime(long contentTime) {
		this.contentTime = contentTime;
		return this;
	}

	public boolean isTop() {
		return top;
	}

	public StreamContent setTop(boolean top) {
		this.top = top;
		return this;
	}

	public int getJumpType() {
		return jumpType;
	}

	public StreamContent setJumpType(int jumpType) {
		this.jumpType = jumpType;
		return this;
	}

	public String getJumpParameter() {
		return jumpParameter;
	}

	public StreamContent setJumpParameter(String jumpParameter) {
		this.jumpParameter = jumpParameter;
		return this;
	}

	public int getResourceType() {
		return resourceType;
	}

	public StreamContent setResourceType(int resourceType) {
		this.resourceType = resourceType;
		return this;
	}

	public String getResourceURL() {
		return resourceURL;
	}

	public StreamContent setResourceURL(String resourceURL) {
		this.resourceURL = resourceURL;
		return this;
	}
	
	
}
