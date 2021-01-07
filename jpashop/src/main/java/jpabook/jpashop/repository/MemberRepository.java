package jpabook.jpashop.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import jpabook.jpashop.domain.Member;

@Repository
public class MemberRepository {
	
	@PersistenceContext
	private EntityManager em;		// EntitiyManger를 만들어 주입시켜줌
	
	
	// 저장에 대해 save() 메소드를 사용
	public Member save(Member member) {
		em.persist(member);
		return member;
	}
	
	
	// 단건 조회 일 경우 find() 메소드 사용
	public Member findbyId(Long id) {
		return em.find(Member.class, id);
	}
	
	// JPQL 방식을 이용하여서 사용
	public List<Member> findAll(){
		return em.createQuery("select m from Member m", Member.class).getResultList();
	}
	
	// JPQL 방식을 이용하여서 사용
	public List<Member> findByName(String name){
		return em.createQuery("select m from Member m where m.name =: name", Member.class)
				.setParameter("name", name)
				.getResultList();
	}

}
  