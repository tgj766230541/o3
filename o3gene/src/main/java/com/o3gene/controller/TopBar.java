package com.o3gene.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/topBar")
public class TopBar {
	
	@RequestMapping("/enterPersonal")
	private Object enterPersonal(){
		return "WEB-INF/jsp/personal";
	}

}
