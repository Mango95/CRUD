package com.axonactive.member;

import java.io.Serializable;

import javax.persistence.Column;

public class MemberBOM implements Serializable{

	private Integer memberid;
	
	public MemberBOM(Integer memberid, String name, int age, String hometown) {
		super();
		this.memberid = memberid;
		this.name = name;
		this.age = age;
		this.hometown = hometown;
	}

	public Integer getMemberid() {
		return memberid;
	}

	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}

	private String name;
	
	
	public String getName() {
		return name;
	}

	public MemberBOM() {
		super();
		// TODO Auto-generated constructor stub
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
