package com.cdzy.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdzy.entity.T_order;
import com.cdzy.service.HWorderService;

@Controller
public class HWorderController {
	 
	@Autowired
	private HWorderService order;
	
	@RequestMapping("/order")
	public String orderifo(String u_id,Model model) {
		List<T_order> list=order.ordersDao(u_id);		
		model.addAttribute("list",list);
		return "order";
	}
}
