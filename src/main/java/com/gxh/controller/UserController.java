package com.gxh.controller;

import com.gxh.pojo.User;
import com.gxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/byId")
	public ModelAndView getUserById(Integer userId){
		ModelAndView mv = new ModelAndView();
		User user = userService.getUserById(userId);
		mv.addObject("user", user);
		mv.setViewName("message");
		return mv;
	}
	
//	@RequestMapping("/byId_1/{userId}")
//	public ModelAndView getUserById_1(@PathVariable("userId") Integer userId){
//		ModelAndView mv = new ModelAndView();
//		User user = userService.getUserById(userId);
//		mv.addObject("user", user);
//		mv.setViewName("message");
//		return mv;
//	}
	
}
