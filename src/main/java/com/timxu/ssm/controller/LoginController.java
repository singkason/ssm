package com.timxu.ssm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.timxu.ssm.domain.Users;
import com.timxu.ssm.service.UsersService;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	private UsersService usersService;

	@RequestMapping("getData")
	@ResponseBody
	public Map<String, Object> getData() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("aaa", 123);

		Users u = new Users();
		u.setUsername("xujinyang");
		u.setPassword("123");
		usersService.insert(u);
		return map;
	}
	
	
	@RequestMapping("")
	
	public String index() {
		return "login";
	}
}
