package com.example.SpringPractice.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);

}
