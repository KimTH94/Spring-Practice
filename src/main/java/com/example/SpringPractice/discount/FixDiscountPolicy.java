package com.example.SpringPractice.discount;

import com.example.SpringPractice.member.Grade;
import com.example.SpringPractice.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? discountFixAmount : 0;
    }
}
