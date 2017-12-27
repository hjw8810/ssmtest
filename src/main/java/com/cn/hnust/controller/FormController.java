package com.cn.hnust.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.model.Testable;
import com.cn.hnust.model.UserInfo;
import com.cn.hnust.service.UserInfoService;

@Controller
@RequestMapping("/form")
public class FormController {
	@Resource
	private UserInfoService userInfoService;
	
	
	//获取已登录用户信息
	@ResponseBody
	@RequestMapping("/getUserInfo")
	public Model getUserIfno(@RequestParam("id") int id,
			Model model) {
		UserInfo userinfo = this.userInfoService.selectByPrimaryKey(id);
		if(null!=userinfo) {
			//日期时间
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String date = formatter.format(userinfo.getEditdate().getTime());
			SimpleDateFormat dateTime = new SimpleDateFormat("HH:mm:ss");
			String time = dateTime.format(userinfo.getEditdate().getTime());
			//String转数组
			String hobby = userinfo.getHobby();
			String[] interest = hobby.split(",");		
			
			model.addAttribute("userinfo", userinfo);
			model.addAttribute("date", date);
			model.addAttribute("time", time);
			model.addAttribute("hobby", interest);
			return model;	
		}else {
			model.addAttribute("msg", "首次编辑资料");
			return model;
		}
	}
	//更新用户信息
	@ResponseBody
	@RequestMapping("/updateUserInfo")
	public Model updateUserInfo(UserInfo updateUserInfo,Model model) {
		
		System.out.println(updateUserInfo);
		
		//用户资料为空的时候新增数据，否则更新数据
		if(updateUserInfo.getInfoid()==null) {
			int insertCount = this.userInfoService.insertSelective(updateUserInfo);
			System.out.println("insertCount:"+insertCount);
			model.addAttribute("Count", insertCount);
			return model;
		}else {
			int updateCount = this.userInfoService.updateByPrimaryKeySelective(updateUserInfo);
			System.out.println("updateCount:"+updateCount);
			model.addAttribute("Count", updateCount);
			return model;
		}
		
	}
	
	//获取所有用户
	@ResponseBody
	@RequestMapping("/getAllUserInfo")
	public Model getAllUserInfo(Model model) {
		List<UserInfo> userInfoList = userInfoService.getAllUsrInfo();
		if(!userInfoList.isEmpty()) {
			model.addAttribute("userInfoList", userInfoList);
			return model;
		}else {
			model.addAttribute("msg", "null");
			return model;
		}
	}
}
