package com.org;

public class User 
{
	private int Id;
	private String name;
	private String password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String name, String password) {
		super();
		Id = id;
		this.name = name;
		this.password = password;
	}
	public User() {
		super();
	}
}
