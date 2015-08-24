package com.avicit.onlinemusic.entity;

import java.io.Serializable;




public class User implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4397489451934183067L;


	private Integer id;


	private String name;


	private String pwd;


	private String musicBox;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMusicBox() {
		return musicBox;
	}

	public void setMusicBox(String musicBox) {
		this.musicBox = musicBox;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd
				+ ", musicBox=" + musicBox + "]";
	}
}
