package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.TestableDao;
import com.cn.hnust.model.Testable;
import com.cn.hnust.service.TestableService;

@Service("testableService")
public class TestableServiceImpl implements TestableService{
	@Resource
	private TestableDao testable;

	@Override
	public Testable selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.testable.selectByPrimaryKey(id);
	}

	@Override
	public List<Testable> getTableAll() {
		// TODO Auto-generated method stub
		return this.testable.getTableAll();
	}




}
