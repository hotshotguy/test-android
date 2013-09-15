package com.example.hh_app;

import java.io.Serializable;

public class UserData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String data;
	private String phone;
	private String email;
	
	public UserData (String data, String phone, String email){
		this.data = data;
		this.phone = phone;
		this.email = email;
	}
	
	public String getData(){
		return this.data;
	}
	
	public String getPhone(){
		return this.phone;
	}
	
	public String getEmail() {
		return this.email;
	}
}
