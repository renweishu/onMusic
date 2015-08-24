package com.avicit.onlinemusic.entity;




public class Link {



	@Override
	public String toString() {
		return "Link [id=" + id + ", value=" + value + ", title=" + title + "]";
	}

	private Integer id;


	private String value;

	
	private String title;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
