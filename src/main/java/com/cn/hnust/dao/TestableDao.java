package com.cn.hnust.dao;


import java.util.List;

import com.cn.hnust.model.Testable;

public interface TestableDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Testable record);

    int insertSelective(Testable record);

    Testable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Testable record);

    int updateByPrimaryKey(Testable record);
    
    List<Testable> getTableAll();
}