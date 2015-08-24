package com.avicit.onlinemusic.vo;



public class MessageVo{


	private Integer id;

	private String userFrom;
	
	private String userToName;

	private Integer userTo;

	private String title;

	private String value;

	private String time;

	private Integer readFlg;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserFrom() {
		return userFrom;
	}

	public void setUserFrom(String userFrom) {
		this.userFrom = userFrom;
	}

	public Integer getUserTo() {
		return userTo;
	}

	public void setUserTo(Integer userTo) {
		this.userTo = userTo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Integer getReadFlg() {
		return readFlg;
	}

	public void setReadFlg(Integer readFlg) {
		this.readFlg = readFlg;
	}

	public String getUserToName() {
		return userToName;
	}

	public void setUserToName(String userToName) {
		this.userToName = userToName;
	}
}
