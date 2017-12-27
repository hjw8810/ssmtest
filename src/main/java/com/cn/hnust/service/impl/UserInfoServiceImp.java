package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserInfoDao;
import com.cn.hnust.model.UserInfo;
import com.cn.hnust.service.UserInfoService;

@Service("userInfoService")
public class UserInfoServiceImp implements UserInfoService {
	@Resource
	private UserInfoDao uinfoDao;

	@Override
	public UserInfo selectByPrimaryKey(Integer infoid) {
		// TODO Auto-generated method stub
		return this.uinfoDao.selectByPrimaryKey(infoid);
	}

	@Override
	public int updateByPrimaryKeySelective(UserInfo record) {
		// TODO Auto-generated method stub
		return this.uinfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int insertSelective(UserInfo record) {
		// TODO Auto-generated method stub
		return this.uinfoDao.insertSelective(record);

	}

	@Override
	public List<UserInfo> getAllUsrInfo() {
		// TODO Auto-generated method stub
		return this.uinfoDao.getAllUserInfo();
	}

}
