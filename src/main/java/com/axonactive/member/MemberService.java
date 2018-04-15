package com.axonactive.member;

import java.util.List;

import javax.ejb.Stateless;

import com.axonactive.common.GenericServices;

@Stateless
public class MemberService extends GenericServices<MemberEntity, MemberBOM>{

	public MemberService() {
		super(MemberEntity.class);
	}

	public List<MemberEntity> readAll(){
		return em.createQuery("Select m from MemberEntity m", MemberEntity.class).getResultList();
	}
	

	
	@Override
	public MemberEntity toEntity(MemberBOM bom) {
		return new MemberEntity(0, bom.getName(), bom.getAge(), bom.getHometown());
	}

	@Override
	public MemberBOM toBom(MemberEntity entity) {
		if (entity != null) {
			MemberBOM emp = new MemberBOM(entity.getId(), entity.getName(), entity.getAge(), entity.getHometown());
			return emp;
		}
		return null;
	}
	
	
}
