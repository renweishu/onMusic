package com.avicit.onlinemusic.entity;




public class Comments {


	@Override
	public String toString() {
		return "Comments [id=" + id + ", value=" + value + ", name=" + name
				+ ", musicId=" + musicId + ", time=" + time + "]";
	}

	private Integer id;


	private String value;


	private String name;


	private Integer musicId;


	private String time;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMusicId() {
		return musicId;
	}

	public void setMusicId(Integer musicId) {
		this.musicId = musicId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}




}
