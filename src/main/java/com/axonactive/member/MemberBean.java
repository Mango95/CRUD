package com.axonactive.member;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "memberBean")
@SessionScoped
public class MemberBean implements Serializable {
	private String name;

	@EJB
	private MemberService memberService;
	
	private List<MemberBOM> members =  new ArrayList<MemberBOM>();
	
	private MemberBOM memberBOM;
	
	public String submit() {
		System.out.println(this.name);
		memberService.save(memberService.toEntity(memberBOM));
		return "welcome";
	}
	
	@PostConstruct
    public void init() {
		members = memberService.toBoms(memberService.readAll());
    }
	
	
	public List<MemberBOM> getMembers() {
		return members;
	}

	public void setMembers(List<MemberBOM> members) {
		this.members = members;
	}

	public MemberBOM getMemberBOM() {
		return memberBOM;
	}

	public void setMemberBOM(MemberBOM memberBOM) {
		this.memberBOM = memberBOM;
	}

	
	
	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
