package com.example.SpringPractice.order;

import com.example.SpringPractice.discount.DiscountPolicy;
import com.example.SpringPractice.discount.FixDiscountPolicy;
import com.example.SpringPractice.member.Member;
import com.example.SpringPractice.member.MemberRepository;
import com.example.SpringPractice.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
