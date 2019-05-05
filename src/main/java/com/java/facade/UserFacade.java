package com.java.facade;

import java.util.List;

import com.java.entity.User;

public interface UserFacade {
	void creatUser(User user);

	List<User> getAllUsers();

	void deleteUser(int id);

	User getUserById(int id);
}
