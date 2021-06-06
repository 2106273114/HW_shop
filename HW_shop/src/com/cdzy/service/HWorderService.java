package com.cdzy.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdzy.dao.HWorderDao;
import com.cdzy.entity.T_order;
@Service
public class HWorderService implements HWorderDao {

	@Autowired
	private HWorderDao order;
	@Override
	public List<T_order> ordersDao(String u_id) {
		List<T_order> list=  order.ordersDao(u_id);
		return list;
	}

}
