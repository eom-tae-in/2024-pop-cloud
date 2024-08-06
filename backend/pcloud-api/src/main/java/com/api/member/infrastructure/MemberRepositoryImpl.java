package com.api.member.infrastructure;

import com.domain.domains.member.domain.Member;
import com.domain.domains.member.domain.MemberRepository;
import com.domain.domains.member.domain.vo.OauthId;
import com.domain.domains.member.infrastructure.MemberJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class MemberRepositoryImpl implements MemberRepository {

    private final MemberJpaRepository memberJpaRepository;

    @Override
    public Member save(final Member member) {
        return memberJpaRepository.save(member);
    }

    @Override
    public Optional<Member> findById(final Long id) {
        return memberJpaRepository.findById(id);
    }

    @Override
    public Optional<Member> findByEmail(final String email) {
        return memberJpaRepository.findByEmail(email);
    }

    @Override
    public boolean existsByEmail(final String email) {
        return memberJpaRepository.existsByEmail(email);
    }

    @Override
    public Optional<Member> findByOauthId(final OauthId oauthId) {
        return memberJpaRepository.findByOauthId(oauthId);
    }
}