package com.avicit.onlinemusic.entity;



public class Tip  {


	@Override
	public String toString() {
		return "Tip [id=" + id + ", value=" + value + "]";
	}

	private Integer id;
	
	private String value;

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


	
}
