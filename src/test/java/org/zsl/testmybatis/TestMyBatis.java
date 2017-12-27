package org.zsl.testmybatis;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.hnust.model.Testable;
import com.cn.hnust.model.User;
import com.cn.hnust.model.UserInfo;
import com.cn.hnust.service.TestableService;
import com.cn.hnust.service.UserInfoService;
import com.cn.hnust.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	// private ApplicationContext ac = null;
	@Resource
	private UserService userService = null;
	@Resource
	private TestableService testableService = null;
	@Resource
	private UserInfoService userInfoService = null;

	// @Before
	// public void before() {
	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService = (IUserService) ac.getBean("userService");
	// }

	@Test
	public void test1() {
		//User user = userService.getUserById(1);
		User user = userService.getUserByNameAndpwd("hjw");
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(user));
	}
	@Test
	public void tableTest() {
		//Testable testable = testableService.selectByPrimaryKey(2);
		Testable testable =null;
		List<Testable> list = testableService.getTableAll();
		Iterator<Testable> it = list.iterator();
		while(it.hasNext()) {
			testable = it.next();
			
			System.out.println(testable.getAddress());
			
		}
		//logger.info(JSON.toJSONString(testable));
		//System.out.println(testable.toString());
		
	}
	
	@Test
	public void getUserInfo() {
		User user = userService.selectByPrimaryKey(1);
		System.out.println(user.getId());
		UserInfo uInfo = userInfoService.selectByPrimaryKey(user.getId());
		logger.info(JSON.toJSONString(uInfo));
		
	}
	
	  
}