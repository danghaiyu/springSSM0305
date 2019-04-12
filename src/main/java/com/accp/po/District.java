package com.accp.po;

public class District {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "District [id=" + id + ", name=" + name + "]";
	}
	public District(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public District(int id) {
		super();
		this.id = id;
	}
	public District() {
		super();
	}
	
}
