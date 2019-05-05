package com.java.Impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.dao.UserDao;
import com.java.entity.User;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory session;

	public List<User> getAllUsers() {
		return session.getCurrentSession().createQuery("FROM User").list();
	}

	public void deleteUser(final int id) {
		session.getCurrentSession().delete(getUserById(id));

	}

	public void addUser(User users) {
		session.getCurrentSession().save(users);

	}

	public void editUser(User users) {
		session.getCurrentSession().update(users);

	}

	public User getUserById(final int id) {
		return session.getCurrentSession().get(User.class,id);
	}

}
