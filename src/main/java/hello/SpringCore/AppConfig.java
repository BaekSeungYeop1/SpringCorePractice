package hello.SpringCore;

import hello.SpringCore.discount.FixDiscountPolicy;
import hello.SpringCore.member.MemberService;
import hello.SpringCore.member.MemberServiceImpl;
import hello.SpringCore.member.MemoryMemberRepository;
import hello.SpringCore.order.OrderService;
import hello.SpringCore.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }


    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private static FixDiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
