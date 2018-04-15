package com.axonactive.member;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name ="memberBean")
@ViewScoped
public class MemberBean implements Serializable{

	private static final long serialVersionUID = 6620131034663738301L;

	@EJB
	private MemberService memberService;
	
	private MemberBOM memberBOM;
	
	@PostConstruct
	public void init() {
		memberBOM = new MemberBOM();
	}
	
	public String insert(){
		memberService.save(memberService.toEntity(memberBOM));
		return "welcome";
	}

	public MemberBOM getMemberBOM() {
		return memberBOM;
	}

	public void setMemberBOM(MemberBOM memberBOM) {
		this.memberBOM = memberBOM;
	}
	
	
	
}
