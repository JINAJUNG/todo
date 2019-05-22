package com.todo.list.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.list.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long>{
}
