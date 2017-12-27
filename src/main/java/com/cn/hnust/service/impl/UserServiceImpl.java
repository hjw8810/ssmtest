package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserDao;
import com.cn.hnust.model.User;
import com.cn.hnust.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

	@Override
	public User getUserByNameAndpwd(String userName) {
		// TODO Auto-generated method stub
		return this.userDao.selectByNameAndPwd(userName);
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return this.userDao.insert(record);
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(id);
	}

	
	

}
