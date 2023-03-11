package com.func.core.module.repository;

import org.springframework.data.repository.CrudRepository;

import com.func.core.module.bo.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
