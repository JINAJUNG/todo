package com.todo.list.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.entity.ToDoEntity;
import com.todo.list.service.ToDoService;

@RestController
public class ToDoController {

	@Autowired
	private ToDoService toDoService;
	
	@PostMapping("/todo")//작성
	public ToDoEntity writedToDo(@Valid @RequestBody ToDoEntity toDoEntity,BindingResult bindingResult) throws Exception {
		while(bindingResult.hasErrors()) {
			throw new Exception("폼 형식에 맞지 않아요");
		}
		return null;
	}
	
	@GetMapping("/todo/{userSeq}")
	public List<ToDoEntity> loadToDo(@PathVariable Long userSeq){
		return toDoService.UserToDoList(userSeq);
	}
}
