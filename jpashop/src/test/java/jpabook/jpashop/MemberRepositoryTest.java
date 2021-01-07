package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;

// cf) @RunWith 어노테이션은 JUNIT 5.xx로 변하면서 없어지고, springBootTest만 사용하면 된다.
@SpringBootTest
public class MemberRepositoryTest {

	
	@Autowired 
	private MemberRepository mr;

	@Test
	@Transactional	// 해당 annotaion이 @test와 같이 있으면 테스트를 수행한 다음 rollback을 수행한다. 그래서 @Rollback(false)로 주면 롤백을 하지 않는다.
	@Rollback(false)
	
	public void saveMemeber() throws Exception{
//		Member member = new Member();
//		member.setUsername("MemberA");
//		Member resultSaveVo = mr.save(member);		// save
//		
//		Member resultFindVo = mr.findbyId(resultSaveVo.getId());
//		
//		Assertions.assertThat(resultFindVo.getId()).isEqualTo(member.getId());
//		Assertions.assertThat(resultFindVo.getUsername()).isEqualTo(member.getUsername());
//		Assertions.assertThat(resultFindVo).isEqualTo(member);
		
	}
	
	
	
}
