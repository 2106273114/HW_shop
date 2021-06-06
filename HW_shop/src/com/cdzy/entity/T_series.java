package com.cdzy.entity;

public class T_series {	//商品系列表
	private String series_id;
	private String series_name;
	public String getSeries_id() {
		return series_id;
	}
	public void setSeries_id(String series_id) {
		this.series_id = series_id;
	}
	public String getSeries_name() {
		return series_name;
	}
	public void setSeries_name(String series_name) {
		this.series_name = series_name;
	}
	public T_series(String series_id, String series_name) {
		super();
		this.series_id = series_id;
		this.series_name = series_name;
	}
	public T_series() {
		super();
	}
	@Override
	public String toString() {
		return "T_series [series_id=" + series_id + ", series_name=" + series_name + "]";
	}
	
}
