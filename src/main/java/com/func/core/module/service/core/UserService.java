package com.func.core.module.service.core;

import com.func.core.module.request.UserAddRequest;
import com.func.core.module.response.Response;

public interface UserService {
	
	Response addUser(UserAddRequest userRequest);
	
}
