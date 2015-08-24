package com.avicit.onlinemusic.entity;

import java.util.ArrayList;
import java.util.List;



public class Music  {



	private List<Comments> listCommnet = new ArrayList<Comments>();


	private Integer id;


	private String title;


	private String singer;


	private String special;


	private String value;


	private String time;


	private Integer click;


	private String url;
	
	private Integer userId;

	@Override
	public String toString() {
		return "Music [listCommnet=" + listCommnet + ", id=" + id + ", title="
				+ title + ", singer=" + singer + ", special=" + special
				+ ", value=" + value + ", time=" + time + ", click=" + click
				+ ", url=" + url + ", userId=" + userId + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public List<Comments> getListCommnet() {
		return listCommnet;
	}
	public void setListCommnet(List<Comments> listCommnet) {
		this.listCommnet = listCommnet;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getClick() {
		return click;
	}
	public void setClick(Integer click) {
		this.click = click;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}


}
