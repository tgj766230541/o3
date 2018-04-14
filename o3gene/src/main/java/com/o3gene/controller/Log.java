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
@RequestMapping("/logs")
public class Log {
	@Autowired
	UserSer userSer;
	
	@RequestMapping("/log")
	private Object logs(User user,HttpSession session,HttpServletRequest req,Md5 md) {
		User temp=userSer.selectByPhonum(user.getPhonum());
		if(null!=temp) {
			if(temp.getPassWord().equals(md.md5(user.getPassWord()))) {
				temp.setPassWord(null);
				session.setAttribute("user", temp);
				return "WEB-INF/jsp/personal";
			}else {
				req.setAttribute("message", "密码错误");
				return "WEB-INF/jsp/error";
			}
		}else {
			req.setAttribute("message", "用户不存在");
			return "WEB-INF/jsp/error";
		}
	}

}
