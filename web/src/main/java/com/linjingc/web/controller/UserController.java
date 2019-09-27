package com.linjingc.web.controller;

import entity.BasicUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/")
	public String helloUser(){
		BasicUser basicUser = new BasicUser();
basicUser.setAge(10);
basicUser.setName("小明");
return basicUser.toString();
	}
}
