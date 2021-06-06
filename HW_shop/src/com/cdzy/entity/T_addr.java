package com.cdzy.entity;

public class T_addr {	//用户地址表
	private String a_id;
	private T_user u_id;	//用户信息表关联
	private String receive_name;
	private String phone_num;
	private String phone_other;
	private String address;
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public T_user getU_id() {
		return u_id;
	}
	public void setU_id(T_user u_id) {
		this.u_id = u_id;
	}
	public String getReceive_name() {
		return receive_name;
	}
	public void setReceive_name(String receive_name) {
		this.receive_name = receive_name;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getPhone_other() {
		return phone_other;
	}
	public void setPhone_other(String phone_other) {
		this.phone_other = phone_other;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public T_addr(String a_id, T_user u_id, String receive_name, String phone_num, String phone_other, String address) {
		super();
		this.a_id = a_id;
		this.u_id = u_id;
		this.receive_name = receive_name;
		this.phone_num = phone_num;
		this.phone_other = phone_other;
		this.address = address;
	}
	public T_addr() {
		super();
	}
	@Override
	public String toString() {
		return "T_addr [a_id=" + a_id + ", u_id=" + u_id + ", receive_name=" + receive_name + ", phone_num=" + phone_num
				+ ", phone_other=" + phone_other + ", address=" + address + "]";
	}
	
}
