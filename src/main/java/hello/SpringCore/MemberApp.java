package hello.SpringCore;

import hello.SpringCore.member.Grade;
import hello.SpringCore.member.Member;
import hello.SpringCore.member.MemberService;
import hello.SpringCore.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);

        Member memberA = new Member(1l, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findmember = memberService.findMember(1l);
        System.out.println("findmember = " + findmember.getName());
        System.out.println("memberA = " + memberA.getName());
    }
}
