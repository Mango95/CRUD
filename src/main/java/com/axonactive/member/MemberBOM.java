package com.axonactive.member;

import java.io.Serializable;

import javax.persistence.Column;

public class MemberBOM implements Serializable{

	private String name;
	
	public String getName() {
		return name;
	}

	public MemberBOM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberBOM(String name, int age, String hometown) {
		super();
		this.name = name;
		this.age = age;
		this.hometown = hometown;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	private int age;
	
	private String hometown;
}
