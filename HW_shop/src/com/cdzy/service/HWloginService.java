package com.cdzy.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdzy.dao.HWloginDao;
import com.cdzy.entity.T_user;

@Service
public class HWloginService implements HWloginDao {

	//dao≤„“˝”√
	@Autowired
	private HWloginDao hd;
	
	@Override
	public T_user Longin(String u_name, String u_pwd) {		
		T_user user=hd.Longin(u_name, u_pwd);
		return user;
	}

}
