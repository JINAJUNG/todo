package com.todo.list.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class ToDoEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long seq;
	@NotNull
	private String content;
	@OneToOne
	@JoinColumn(name="userEntity_seq")
	private UserEntity user;
}

