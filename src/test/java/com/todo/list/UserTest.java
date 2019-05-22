package com.todo.list;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.todo.list.entity.UserEntity;
import com.todo.list.repo.UserRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserTest {

	@Autowired
	private UserRepo userRepo;
	
	@Test
	public void userRepo() {
		UserEntity user = new UserEntity();
		user.setSeq(2L);
		user.setId("id");
		user.setUserName("jinas");
		userRepo.save(user);
		log.debug(userRepo.findById(1L).toString());
	}

}
