package com.cdzy.entity;

public class T_user {	//用户信息表
	private String u_id;
	private String u_name;
	private String u_pwd;
	private String u_sex;
	private String u_birth;
	public T_user(String u_id, String u_name, String u_pwd, String u_sex, String u_birth) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_pwd = u_pwd;
		this.u_sex = u_sex;
		this.u_birth = u_birth;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_pwd() {
		return u_pwd;
	}
	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}
	public String getU_sex() {
		return u_sex;
	}
	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}
	public String getU_birth() {
		return u_birth;
	}
	public void setU_birth(String u_birth) {
		this.u_birth = u_birth;
	}
	public T_user() {
		super();
	}
	@Override
	public String toString() {
		return "T_user [u_id=" + u_id + ", u_name=" + u_name + ", u_pwd=" + u_pwd + ", u_sex=" + u_sex + ", u_birth="
				+ u_birth + "]";
	}
	
}
