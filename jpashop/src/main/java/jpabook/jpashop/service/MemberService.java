package jpabook.jpashop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	
	/**
	 *  회원 가입
	 * @MethodName : join
	 * @param memeber
	 * @return
	 * @returnCode :
	 */
	
	public Long join (Member member) {
		validationDuplicateMember(member);		
		memberRepository.save(member);
		return member.getId();
	}
	
	
	private void validationDuplicateMember(Member member) {
		List<Member> findMemebers = memberRepository.findByName(member.getName());
		
		if(!findMemebers.isEmpty()) {
			throw new IllegalStateException("중복된 회원입니다.");
		}
				
	}
	
	
	// 회원 전체 조회
	
}
