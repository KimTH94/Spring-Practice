package com.example.SpringPractice.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}
