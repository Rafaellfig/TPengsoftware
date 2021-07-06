package com.engsoft.tp1backend.exception;

public class EngSoftException extends Exception {
	private static final long serialVersionUID = 1L;

	public EngSoftException(String msg) {
		super(msg);
	}

	public EngSoftException(Exception ex) {
		super(ex);
	}

	public EngSoftException(String msg, Exception ex) {
		super(msg, ex);
	}
}
