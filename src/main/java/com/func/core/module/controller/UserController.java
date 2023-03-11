package com.func.core.module.controller;


import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.func.core.module.request.UserRequest;
import com.func.core.module.util.UrlConstants;

@RestController
public class UserController {
	
	private static final Logger log = LogManager.getLogger(UserController.class);

	@PostMapping(value = UrlConstants.USER)
	public void addUser(@RequestBody @Valid UserRequest userRequest) {
	}
}
