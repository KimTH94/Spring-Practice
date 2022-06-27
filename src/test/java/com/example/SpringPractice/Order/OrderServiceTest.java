package com.example.SpringPractice.Order;

import com.example.SpringPractice.member.Grade;
import com.example.SpringPractice.member.Member;
import com.example.SpringPractice.member.MemberService;
import com.example.SpringPractice.member.MemberServiceImpl;
import com.example.SpringPractice.order.Order;
import com.example.SpringPractice.order.OrderService;
import com.example.SpringPractice.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA",  10000);
        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
