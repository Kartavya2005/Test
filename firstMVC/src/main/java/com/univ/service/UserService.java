package com.univ.service;

import com.univ.Model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univ.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}
}
