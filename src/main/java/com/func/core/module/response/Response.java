package com.func.core.module.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
	
	private int code;
	
	private String status;
	
	private String message;

}
