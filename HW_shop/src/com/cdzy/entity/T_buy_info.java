package com.cdzy.entity;

public class T_buy_info {	//商品购买详情表
	private String goods_id;
	private T_goods_select model_name;	//商品筛选详情表关联
	private String phone_color;
	private String now_time;
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public T_goods_select getModel_name() {
		return model_name;
	}
	public void setModel_name(T_goods_select model_name) {
		this.model_name = model_name;
	}
	public String getPhone_color() {
		return phone_color;
	}
	public void setPhone_color(String phone_color) {
		this.phone_color = phone_color;
	}
	public String getNow_time() {
		return now_time;
	}
	public void setNow_time(String now_time) {
		this.now_time = now_time;
	}
	public T_buy_info(String goods_id, T_goods_select model_name, String phone_color, String now_time) {
		super();
		this.goods_id = goods_id;
		this.model_name = model_name;
		this.phone_color = phone_color;
		this.now_time = now_time;
	}
	public T_buy_info() {
		super();
	}
	@Override
	public String toString() {
		return "T_buy_info [goods_id=" + goods_id + ", model_name=" + model_name + ", phone_color=" + phone_color
				+ ", now_time=" + now_time + "]";
	}
	
	
}
