package com.ksb.openapi.error;

/**
 * 快送宝-异常处理API基类 所有后端的异常需要继承这个基类 前端或者JOB通过这个基类获取错误信息和错误码
 * 
 * @author yaming.xu
 * 
 */
public class SessionTimeoutException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9061405009023992371L;

	public SessionTimeoutException() {
		super();
	}

	public SessionTimeoutException(Throwable cause) {
		super(cause);
	}

	public SessionTimeoutException(String message) {
		super(message);
	}


}
