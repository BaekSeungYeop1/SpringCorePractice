package hello.SpringCore;

import hello.SpringCore.member.Grade;
import hello.SpringCore.member.Member;
import hello.SpringCore.member.MemberService;
import hello.SpringCore.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        Member memberA = new Member(1l, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findmember = memberService.findMember(1l);
        System.out.println("findmember = " + findmember.getName());
        System.out.println("memberA = " + memberA.getName());
    }
}
