package com.itbase.webserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itbase.business.service.UserService;
import com.itbase.plugin.vo.UserVo;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{id}")
	public UserVo user(@PathVariable("id")Integer id) {
		return userService.findById(id);
	}
	
	@GetMapping("/test")
	public UserVo test() {
		System.out.println("-----------------------------");
		return new UserVo("hello",10);
	}
}
