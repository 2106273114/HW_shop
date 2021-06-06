package com.cdzy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cdzy.entity.T_order;

public interface HWorderDao {
	
	@Select("select U_flow, u_id,goods_id,order_time,order_num,order_money,(CASE order_status WHEN 0 THEN '退货'  WHEN 1 THEN '处理完成' WHEN 2 THEN '正在处理' WHEN 3 THEN '已发起但未处理' WHEN 4 THEN '未启动'END)order_status from t_order where u_id=#{u_id}")
	public List<T_order> ordersDao(String u_id);
	//select id,
	//(CASE state WHEN 1 THEN '处理完成' WHEN 2 THEN '正在处理但未完成' WHEN 3 THEN '已发起但未处理' WHEN 4 THEN '未启动'END)state,
	//(CASE project WHEN 1 THEN '大额存单' WHEN 2 THEN '对公业务' WHEN 3 THEN '对私业务' END)project from project
}
