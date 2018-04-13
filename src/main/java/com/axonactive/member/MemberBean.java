package com.axonactive.member;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "memberBean")
@SessionScoped
public class MemberBean implements Serializable {
	private String name;

	@EJB
	private MemberService memberService;
	
	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String submit() {
		System.out.println(this.name);
		return "welcome";
	}
}
