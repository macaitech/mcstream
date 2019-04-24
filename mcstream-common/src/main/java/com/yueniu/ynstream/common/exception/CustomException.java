package com.yueniu.ynstream.common.exception;

/**
 * 自定义业务异常
 */
public class CustomException extends RuntimeException {
	
	private static final long serialVersionUID = -7535678064045845850L;
	
	private int code;

	public CustomException() {
		
	}

	public CustomException(int code, String message) {
		super(message);
		this.code = code;
	}
	
	
	public CustomException(int code, String message,Throwable e) {
		super(message,e);
		this.code = code;
	}
	
	public CustomException(String message,Throwable e) {
		super(message,e);
	}
	
	
	public CustomException(Throwable e) {
		super(e);
	}
	
	public CustomException(String msg) {
		super(msg);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
