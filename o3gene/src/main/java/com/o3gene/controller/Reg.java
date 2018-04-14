package com.o3gene.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.o3gene.beans.User;
import com.o3gene.service.UserSer;
import com.o3gene.tools.Md5;

@Controller
@RequestMapping("regs")
public class Reg {
	
	ModelAndView mv;
	
	@Autowired
	UserSer userSer;
	
	@RequestMapping("reg")
	private Object regs(HttpSession session,Md5 md,String phocode,User user,HttpServletRequest req){
		user.setUserTypeId(1);
		user.setI18n(req.getLocale().toString());
		user.setPassWord(md.md5(user.getPassWord()));
		int temp=userSer.insert(user);
		if(1==temp){
			User tempUser=userSer.selectByPhonum(user.getPhonum());
			tempUser.setPassWord(null);
			session.setAttribute("user", tempUser);
			return "WEB-INF/jsp/personal";
		}else{
			return "WEB-INF/jsp/error";
		}
	}

}
