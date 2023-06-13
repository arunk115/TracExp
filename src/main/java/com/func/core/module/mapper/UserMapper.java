package com.func.core.module.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.func.core.module.bo.User;
import com.func.core.module.request.UserAddRequest;

@Mapper(componentModel = "spring")
public interface UserMapper {
	User userAddRequestToUser(UserAddRequest userRequest);
}
