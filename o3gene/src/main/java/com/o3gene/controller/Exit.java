package com.o3gene.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exits")
public class Exit {
	
	@RequestMapping("/exit")
	private Object exits(HttpSession session,HttpServletRequest req) {
		session.removeAttribute("user");
		return "log";
	}

}
