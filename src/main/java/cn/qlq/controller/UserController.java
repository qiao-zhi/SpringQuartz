package cn.qlq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@RequestMapping("/login")
	public @ResponseBody String getUser(String username,String password) {
		return "username:"+username+"\tpassword"+":"+password;
	}
}
