package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.model.UserInfo;

public interface UserInfoDao {
    int deleteByPrimaryKey(Integer infoid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer infoid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

	List<UserInfo> getAllUserInfo();
}