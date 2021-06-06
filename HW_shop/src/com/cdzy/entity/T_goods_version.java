package com.cdzy.entity;

public class T_goods_version {		//商品版本表
	private int version_id;
	private T_goods_select model_name;//商品筛选详情表关联
	private String memory_version;
	private int price;
	public int getVersion_id() {
		return version_id;
	}
	public void setVersion_id(int version_id) {
		this.version_id = version_id;
	}
	public T_goods_select getModel_name() {
		return model_name;
	}
	public void setModel_name(T_goods_select model_name) {
		this.model_name = model_name;
	}
	public String getMemory_version() {
		return memory_version;
	}
	public void setMemory_version(String memory_version) {
		this.memory_version = memory_version;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public T_goods_version(int version_id, T_goods_select model_name, String memory_version, int price) {
		super();
		this.version_id = version_id;
		this.model_name = model_name;
		this.memory_version = memory_version;
		this.price = price;
	}
	public T_goods_version() {
		super();
	}
	@Override
	public String toString() {
		return "T_goods_version [version_id=" + version_id + ", model_name=" + model_name + ", memory_version="
				+ memory_version + ", price=" + price + "]";
	}
	
}
