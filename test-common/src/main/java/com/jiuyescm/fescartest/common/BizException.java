package com.jiuyescm.fescartest.common;

public class BizException extends RuntimeException{
	private static final long serialVersionUID = 1089587984957093451L;
	public BizException() { }
	public BizException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	private String msg;
	private String code;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}
