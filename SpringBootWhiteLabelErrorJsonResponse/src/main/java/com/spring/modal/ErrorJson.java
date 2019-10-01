package com.spring.modal;

public class ErrorJson {
	private int status;
	private String reason;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public ErrorJson(int status, String reason) {
		super();
		this.status = status;
		this.reason = reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
