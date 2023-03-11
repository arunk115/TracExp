package com.func.core.module.request;

import javax.validation.constraints.NotNull;

import com.func.core.module.enums.Status;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
	
	private Integer id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String email;
	
	@NotNull
	private String password;
	
	@NotNull
	private Status status;

}
