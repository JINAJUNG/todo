package com.todo.list.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.list.entity.ToDoEntity;
import com.todo.list.repo.ToDoRepo;

@Service
public class ToDoService {
	@Autowired
	private ToDoRepo toDoRepo;
	
	public List<ToDoEntity> UserToDoList(Long userSeq){
		return toDoRepo.findAll();
	}
}
