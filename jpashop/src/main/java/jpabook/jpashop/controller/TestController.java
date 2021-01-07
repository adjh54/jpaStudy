package jpabook.jpashop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;

@Controller
public class TestController {

	@Autowired 
	private MemberRepository mr;
	
	@PostMapping("/test/saveMemer")
	public Member saveMember () {
		Member member = new Member();
		member.setName("MemberA");
		Member resultSaveVo = mr.save(member);		// save
		
		Member resultFindVo = mr.findbyId(resultSaveVo.getId());
		
		return resultFindVo;
	}
}
