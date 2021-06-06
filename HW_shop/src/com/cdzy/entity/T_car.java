package com.cdzy.entity;

public class T_car {	//商品购物车表
	private String car_id;
	private T_user u_id;	//用户信息表关联
	private T_buy_info goods_id;	//商品购买详情表关联
	private int count;
	private Double price;
	private String goods_name;
	private int state;
	private String color;
	private String type;
	public T_car(String car_id, T_user u_id, T_buy_info goods_id, int count, Double price, String goods_name, int state,
			String color, String type) {
		super();
		this.car_id = car_id;
		this.u_id = u_id;
		this.goods_id = goods_id;
		this.count = count;
		this.price = price;
		this.goods_name = goods_name;
		this.state = state;
		this.color = color;
		this.type = type;
	}
	public T_car() {
		super();
	}
	public String getCar_id() {
		return car_id;
	}
	public void setCar_id(String car_id) {
		this.car_id = car_id;
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "T_car [car_id=" + car_id + ", u_id=" + u_id + ", goods_id=" + goods_id + ", count=" + count + ", price="
				+ price + ", goods_name=" + goods_name + ", state=" + state + ", color=" + color + ", type=" + type
				+ "]";
	}
	
}
