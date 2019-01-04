package ck.tyut.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ck.tyut.first.domain.User;
import ck.tyut.first.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "get", method = RequestMethod.GET)
	public @ResponseBody User getUser(String userId) {
		return userService.getUser(userId);
	}
}