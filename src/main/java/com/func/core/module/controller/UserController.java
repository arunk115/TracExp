package com.func.core.module.controller;


import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.func.core.module.request.UserAddRequest;
import com.func.core.module.response.Response;
import com.func.core.module.service.core.UserService;
import com.func.core.module.util.UrlConstants;

@RestController
@RequestMapping(UrlConstants.V1 + UrlConstants.USER)
public class UserController {
	
	private static final Logger log = LogManager.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	@PostMapping
	public Response addUser(@RequestBody @Valid UserAddRequest userRequest) {
		return userService.addUser(userRequest);
	}
}
