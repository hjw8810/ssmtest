package com.cn.hnust.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.model.Testable;
import com.cn.hnust.service.TestableService;

@Controller
@RequestMapping("/table")
public class TestableController {
	@Resource
	private TestableService testableService;

	// 获取testable表数据
	@ResponseBody
	@RequestMapping("getTableAll")
	public Model tableAll(Model model) {
		List<Testable> tableList = testableService.getTableAll();
		if (!tableList.isEmpty()) {
			System.out.println(tableList.size());
			model.addAttribute("countTable", tableList.size());
			model.addAttribute("testbale", tableList);
			return model;
		} else {
			model.addAttribute("msg", "null");
			return model;
		}

	}

}
