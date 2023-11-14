package samp17;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//xml파일을 대체해서 설정 작업을 하는 java
@Configuration
public class JavaConfig {
	@Bean
	public MemberDao memberDao() {
		return new MemberDaoImpl();
	}
	@Bean
	public MemberService memberService() {
		return new MemberServiceImpl();
	}
}
