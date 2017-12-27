package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.model.UserInfo;

public interface UserInfoService {
	public UserInfo selectByPrimaryKey(Integer infoid);
	
	public int updateByPrimaryKeySelective(UserInfo record);
	
	public int insertSelective(UserInfo record);

	public List<UserInfo> getAllUsrInfo();

}
