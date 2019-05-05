package com.java.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.dao.UserDao;
import com.java.entity.User;
import com.java.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Transactional
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Transactional
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	@Transactional
	public void addUser(User users) {
		userDao.addUser(users);
	}

	@Transactional
	public void editUser(User users) {
		userDao.editUser(users);

	}

	@Transactional
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

}
