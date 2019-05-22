package com.todo.list.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.entity.UserEntity;
import com.todo.list.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public UserEntity login(@Valid @RequestBody UserEntity user,BindingResult bindingResult) throws Exception {
		while(bindingResult.hasErrors()) {
			throw new Exception("login fail..");
		}
		return user;// db랑 매칭
	}
}
