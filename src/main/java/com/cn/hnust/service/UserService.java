package com.cn.hnust.service;

import com.cn.hnust.model.User;

public interface UserService {
	public User getUserById(int userId);
	public User getUserByNameAndpwd(String userName);
	public int insert(User record);
	public User selectByPrimaryKey(Integer id);
}