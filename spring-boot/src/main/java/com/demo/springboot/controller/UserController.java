package com.demo.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.mapper.UserMapper;
import com.demo.springboot.model.User;

@RestController
@RequestMapping({ "/user" })
public class UserController {

	@Autowired
	UserMapper userMapper;

	@RequestMapping(value = "/findAll")
	@ResponseBody
	public List<User> findAll() {
		List<User> userList = userMapper.findAll();
		return userList;
	}
}
