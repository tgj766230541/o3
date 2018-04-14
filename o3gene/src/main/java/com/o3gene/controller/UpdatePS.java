package com.o3gene.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.o3gene.beans.User;
import com.o3gene.service.UserSer;
import com.o3gene.tools.Md5;

@Controller
@RequestMapping("/updatePSs")
public class UpdatePS {
	
	@Autowired
	UserSer userSer;
	
	@RequestMapping("/updatePS")
	private Object updatePSs(String passWord,HttpSession session,HttpServletRequest req,Md5 md) {
		User user=(User) session.getAttribute("user");
		user.setPassWord(md.md5(passWord));
		int temp=userSer.updatePS(user);
		if(1==temp) {
			return "WEB-INF/jsp/success";
		}else {
			req.setAttribute("message", "修改失败");
			return "WEB-INF/jsp/error";
		}
	}

}
