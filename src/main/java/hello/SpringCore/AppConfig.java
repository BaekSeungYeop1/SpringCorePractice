package hello.SpringCore;

import hello.SpringCore.discount.DiscountPolicy;
import hello.SpringCore.discount.FixDiscountPolicy;
import hello.SpringCore.discount.RateDiscountPolicy;
import hello.SpringCore.member.MemberRepository;
import hello.SpringCore.member.MemberService;
import hello.SpringCore.member.MemberServiceImpl;
import hello.SpringCore.member.MemoryMemberRepository;
import hello.SpringCore.order.OrderService;
import hello.SpringCore.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
