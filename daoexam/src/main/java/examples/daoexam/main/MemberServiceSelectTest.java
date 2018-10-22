package examples.daoexam.main;

import examples.daoexam.config.ApplicationConfig;
import examples.daoexam.dto.Member;
import examples.daoexam.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberServiceSelectTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		MemberService memberService = context.getBean(MemberService.class);
		Member member = memberService.getMember("Lee@gmail.com");

		System.out.println(member);
	}
}
