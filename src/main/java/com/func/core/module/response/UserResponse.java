package com.func.core.module.response;

import javax.validation.constraints.NotNull;

import com.func.core.module.enums.Status;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
	
	private Integer id;
	
	private String name;
	
	private String email;
		
	private Status status;

}
