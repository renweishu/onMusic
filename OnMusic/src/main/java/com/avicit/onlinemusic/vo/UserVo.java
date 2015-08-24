package com.avicit.onlinemusic.vo;

import java.io.Serializable;



public class UserVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1315280673139367502L;

	private Integer id;

	private String name;

	private String pwd;
	
	private String confirmPwd;



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

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

}
