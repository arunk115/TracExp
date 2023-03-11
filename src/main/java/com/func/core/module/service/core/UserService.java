package com.func.core.module.service.core;

import com.func.core.module.request.UserRequest;
import com.func.core.module.response.UserResponse;

public interface UserService {
	
	UserResponse addUser(UserRequest userRequest);
	
}
