package com.cdzy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cdzy.entity.T_order;

public interface HWorderDao {
	
	@Select("select U_flow, u_id,goods_id,order_time,order_num,order_money,(CASE order_status WHEN 0 THEN '�˻�'  WHEN 1 THEN '�������' WHEN 2 THEN '���ڴ���' WHEN 3 THEN '�ѷ���δ����' WHEN 4 THEN 'δ����'END)order_status from t_order where u_id=#{u_id}")
	public List<T_order> ordersDao(String u_id);
	//select id,
	//(CASE state WHEN 1 THEN '�������' WHEN 2 THEN '���ڴ���δ���' WHEN 3 THEN '�ѷ���δ����' WHEN 4 THEN 'δ����'END)state,
	//(CASE project WHEN 1 THEN '���浥' WHEN 2 THEN '�Թ�ҵ��' WHEN 3 THEN '��˽ҵ��' END)project from project
}
