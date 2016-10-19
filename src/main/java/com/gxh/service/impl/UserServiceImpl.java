package com.gxh.service.impl;


import com.gxh.dao.UserDao;
import com.gxh.pojo.User;
import com.gxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserDao userDao;


	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}

}
