package hello.SpringCore.Order;

import hello.SpringCore.member.Grade;
import hello.SpringCore.member.Member;
import hello.SpringCore.member.MemberService;
import hello.SpringCore.member.MemberServiceImpl;
import hello.SpringCore.order.Order;
import hello.SpringCore.order.OrderService;
import hello.SpringCore.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        long memberId = 1l;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);


    }
}
