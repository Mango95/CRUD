package com.axonactive.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class MemberEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="age", nullable=false)
	private int age;
	
	@Column(name="hometown", nullable=false)
	private String hometown;

	public MemberEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberEntity(int id, String name, int age, String hometown) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.hometown = hometown;
	}

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
}
