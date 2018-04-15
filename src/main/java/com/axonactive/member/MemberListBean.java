package com.axonactive.member;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "memberListBean")
@ViewScoped
public class MemberListBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1583084340414538009L;


	@EJB
	private MemberService memberService;
	
	private List<MemberBOM> members =  new ArrayList<MemberBOM>();
	


	
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



	
	
}
