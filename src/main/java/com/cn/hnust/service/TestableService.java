package com.cn.hnust.service;


import java.util.List;

import com.cn.hnust.model.Testable;

public interface TestableService {

	public Testable selectByPrimaryKey(Integer id);

	public List<Testable> getTableAll();

}
