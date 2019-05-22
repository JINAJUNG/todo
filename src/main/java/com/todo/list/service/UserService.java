package com.todo.list.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.list.entity.UserEntity;
import com.todo.list.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public UserEntity login(UserEntity userEntity) {
		return userEntity;
	}
}
