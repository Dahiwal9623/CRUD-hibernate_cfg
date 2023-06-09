package com.example;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friend")
public class Friend implements Serializable {
	
	@Id
	public int id;
	public String name;
	public String nickname;
	public String address;
	public String phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "nickname")
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Column(name = "address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Friend(String name, String nickname, String address, String phone) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.address = address;
		this.phone = phone;
	}
	
	public Friend(int id, String name, String nickname, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.address = address;
		this.phone = phone;
	}
	
	public Friend() {
	}
	@Override
	public String toString() {
		return "";
	}
}



















