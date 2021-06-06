package com.cdzy.entity;

import java.util.Date;

public class T_order {	//订单表
	private int U_flow;
	private T_user u_id;	//用户表关联
	private T_buy_info goods_id;	//商品购买详情表关联
	private Date order_time;
	private int order_num;
	private Float order_money;
	private String order_status;
	public int getU_flow() {
		return U_flow;
	}
	public void setU_flow(int u_flow) {
		U_flow = u_flow;
	}
	public T_user getU_id() {
		return u_id;
	}
	public void setU_id(T_user u_id) {
		this.u_id = u_id;
	}
	public T_buy_info getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(T_buy_info goods_id) {
		this.goods_id = goods_id;
	}
	public Date getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}
	public int getOrder_num() {
		return order_num;
	}
	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}
	public Float getOrder_money() {
		return order_money;
	}
	public void setOrder_money(Float order_money) {
		this.order_money = order_money;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public T_order(int u_flow, T_user u_id, T_buy_info goods_id, Date order_time, int order_num, Float order_money,
			String order_status) {
		super();
		U_flow = u_flow;
		this.u_id = u_id;
		this.goods_id = goods_id;
		this.order_time = order_time;
		this.order_num = order_num;
		this.order_money = order_money;
		this.order_status = order_status;
	}
	public T_order() {
		super();
	}
	@Override
	public String toString() {
		return "T_order [U_flow=" + U_flow + ", u_id=" + u_id + ", goods_id=" + goods_id + ", order_time=" + order_time
				+ ", order_num=" + order_num + ", order_money=" + order_money + ", order_status=" + order_status + "]";
	}
	
}
