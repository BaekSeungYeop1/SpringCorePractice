package hello.SpringCore.Member;

import hello.SpringCore.AppConfig;
import hello.SpringCore.member.Grade;
import hello.SpringCore.member.Member;
import hello.SpringCore.member.MemberService;
import hello.SpringCore.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join(){
        //given
        Member member = new Member(1l, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1l);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
