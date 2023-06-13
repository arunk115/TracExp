package com.func.core.module.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	protected String code;
	protected int status;
	protected String debugMessage;
	protected String clientMessage;
	
}
