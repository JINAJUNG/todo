package com.todo.list.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.list.entity.ToDoEntity;

public interface ToDoRepo extends JpaRepository<ToDoEntity, Long>{
}
