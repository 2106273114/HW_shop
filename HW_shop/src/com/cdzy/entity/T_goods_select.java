package com.cdzy.entity;

import java.math.BigInteger;
import java.util.Date;

public class T_goods_select {
	private String model_id;
	private String model_name;
	private T_series series_id;	//商品系列表关联
	private int show_price;
	private String show_img;
	private BigInteger comment_num;
	private int stock;
	private int period_free;
	private int perferential;
	private Float screen_size;
	private int running_memory;
	private int memory;
	private Date add_time;
	public String getModel_id() {
		return model_id;
	}
	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public T_series getSeries_id() {
		return series_id;
	}
	public void setSeries_id(T_series series_id) {
		this.series_id = series_id;
	}
	public int getShow_price() {
		return show_price;
	}
	public void setShow_price(int show_price) {
		this.show_price = show_price;
	}
	public String getShow_img() {
		return show_img;
	}
	public void setShow_img(String show_img) {
		this.show_img = show_img;
	}
	public BigInteger getComment_num() {
		return comment_num;
	}
	public void setComment_num(BigInteger comment_num) {
		this.comment_num = comment_num;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPeriod_free() {
		return period_free;
	}
	public void setPeriod_free(int period_free) {
		this.period_free = period_free;
	}
	public int getPerferential() {
		return perferential;
	}
	public void setPerferential(int perferential) {
		this.perferential = perferential;
	}
	public Float getScreen_size() {
		return screen_size;
	}
	public void setScreen_size(Float screen_size) {
		this.screen_size = screen_size;
	}
	public int getRunning_memory() {
		return running_memory;
	}
	public void setRunning_memory(int running_memory) {
		this.running_memory = running_memory;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public Date getAdd_time() {
		return add_time;
	}
	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}
	public T_goods_select(String model_id, String model_name, T_series series_id, int show_price, String show_img,
			BigInteger comment_num, int stock, int period_free, int perferential, Float screen_size, int running_memory,
			int memory, Date add_time) {
		super();
		this.model_id = model_id;
		this.model_name = model_name;
		this.series_id = series_id;
		this.show_price = show_price;
		this.show_img = show_img;
		this.comment_num = comment_num;
		this.stock = stock;
		this.period_free = period_free;
		this.perferential = perferential;
		this.screen_size = screen_size;
		this.running_memory = running_memory;
		this.memory = memory;
		this.add_time = add_time;
	}
	public T_goods_select() {
		super();
	}
	@Override
	public String toString() {
		return "T_goods_select [model_id=" + model_id + ", model_name=" + model_name + ", series_id=" + series_id
				+ ", show_price=" + show_price + ", show_img=" + show_img + ", comment_num=" + comment_num + ", stock="
				+ stock + ", period_free=" + period_free + ", perferential=" + perferential + ", screen_size="
				+ screen_size + ", running_memory=" + running_memory + ", memory=" + memory + ", add_time=" + add_time
				+ "]";
	}
	
}
