package com.java.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.entity.User;
import com.java.facade.UserData;
import com.java.facade.UserFacade;
import com.java.service.UserService;

@Component("userFacade")
public class UserFacadeImpl implements UserFacade {
	@Autowired
	private UserService userService;
	public void creatUser(final UserData userData) {
		User userEntity = new User();
		userEntity.setId(userData.getId());
		userEntity.setPassword(userData.getPassword());
		userEntity.setFullName(userData.getFullName());
		userEntity.setPhoto(userData.getPhoto());
		userEntity.setEmail(userData.getEmail());
		userService.addUser(userEntity);
		

	}
}
