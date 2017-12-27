package com.cn.hnust.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.model.User;
import com.cn.hnust.model.UserInfo;
import com.cn.hnust.service.UserInfoService;
import com.cn.hnust.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Resource
	private UserService userService;
	@Resource
	private UserInfoService userInfoService;

	// 登录方法
	@ResponseBody
	@RequestMapping("/loginN")
	public Model toIndex(@RequestParam("username") String userName, @RequestParam("password") String password,
			Model model) {
		System.out.println(userName + "::" + password);
		User user = this.userService.getUserByNameAndpwd(userName);
		// System.out.println(user.getUserName());
		if (null == user) {
			model.addAttribute("msg", "用户名不存在");
			return model;
		} else {
			if (user.getPassword().equals(password)) {

				model.addAttribute("userid", user.getId());
				model.addAttribute("user", user.getUserName());
				model.addAttribute("path", "home_index");
				return model;
			} else {
				model.addAttribute("msg", "密码错误");
				return model;
			}
		}
	}

	// 登录名检查
	@ResponseBody
	@RequestMapping("/clogin")
	public Boolean checkName(@RequestParam("username") String userName) {
		System.out.println(userName);
		Boolean flag;
		if (this.userService.getUserByNameAndpwd(userName) == null) {
			flag = false;
		} else {
			flag = true;
		}
		return flag;
	}

	// 用户注册
	@RequestMapping("/register")
	public String register(@RequestParam("username") String userName, @RequestParam("password") String password,
			@RequestParam("age") int age, Model model) {
		System.out.println(userName + password + age);
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setAge(age);
		int count = this.userService.insert(user);
		System.out.println(count);
		if (count != 0) {

			model.addAttribute("user", user.getUserName());
			model.addAttribute("path", "login");

			return "successed";
		} else {
			model.addAttribute("msg", "注册失败");
			return "register";
		}
	}
}
