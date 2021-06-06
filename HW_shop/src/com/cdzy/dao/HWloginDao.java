package com.cdzy.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cdzy.entity.T_user;

public interface HWloginDao {
	//µÇÂ¼sqlÓï¾ä
	@Select(value = "select * from T_user where u_name=#{u_name} and u_pwd=#{u_pwd}")
	public T_user Longin(@Param("u_name") String u_name,@Param("u_pwd") String u_pwd);
	
	//×¢²ásqlÓï¾ä

}
