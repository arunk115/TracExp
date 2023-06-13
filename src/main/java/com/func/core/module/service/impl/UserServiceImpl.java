package com.func.core.module.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.func.core.module.bo.User;
import com.func.core.module.mapper.UserMapper;
import com.func.core.module.repository.UserRepository;
import com.func.core.module.request.UserAddRequest;
import com.func.core.module.response.Response;
import com.func.core.module.service.core.UserService;
import com.func.core.module.util.CustomException;
import com.func.core.module.util.UrlConstants;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Response addUser(UserAddRequest userRequest) {
		if(validateUserRequest(userRequest)) {
			User user = userMapper.userAddRequestToUser(userRequest);
			user.setCreatedOn(new Date());
			user.setModifiedOn(new Date());
			userRepository.save(user);
		}
		return new Response(UrlConstants._201, "Created", "User created successfully!");
	}
	
	private boolean validateUserRequest(UserAddRequest userRequest) {
		if(userRequest.getName().equals("")) {
			throw new CustomException(UrlConstants.BAD_REQUEST, UrlConstants._400, "Name cannot be empty", "Name cannot be empty");
		}
		if(userRequest.getPassword().equals("")) {
			throw new CustomException(UrlConstants.BAD_REQUEST, UrlConstants._400, "Password cannot be empty", "Password cannot be empty");
		}
		if(userRequest.getEmail().equals("")) {
			throw new CustomException(UrlConstants.BAD_REQUEST, UrlConstants._400, "Email cannot be empty", "Email cannot be empty");
		}
		return true;
	}

	
}
