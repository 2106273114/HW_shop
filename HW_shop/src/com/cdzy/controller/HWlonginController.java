package com.cdzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdzy.entity.T_user;
import com.cdzy.service.HWloginService;

@Controller
public class HWlonginController {
	//serviceÒýÓÃ
	@Autowired
	private HWloginService service;
	
	//µÇÂ¼ÅÐ¶Ï
	@RequestMapping(value = "/login")
	public String userlogin(String u_name,String u_pwd,Model model) {
		T_user user= service.Longin(u_name, u_pwd);
		if (user!=null) {
			model.addAttribute("u_name", u_name);
			model.addAttribute("u_pwd", u_pwd);
			model.addAttribute("u_id", user.getU_id());
			model.addAttribute("u_birth", user.getU_birth());
			model.addAttribute("u_sex", user.getU_sex());
			return "HWhomepage";
		}else {
			model.addAttribute("ture", "µÇÂ¼Ê§°Ü");
			return "HWlogin";
			
		}	
	}
}
