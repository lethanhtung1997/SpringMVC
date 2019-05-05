package com.java.dao;

import java.util.List;

import com.java.entity.User;

public interface UserDao {
	List<User> getAllUsers();

	public void deleteUser(final int id);

	public void addUser(User users);

	public void editUser(User users);

	User getUserById(final int id);
}
