package com.domain.domains.member.domain;

import com.domain.domains.member.domain.vo.OauthId;

import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findById(Long id);

    Optional<Member> findByEmail(String email);

    boolean existsByEmail(String email);

    Optional<Member> findByOauthId(OauthId oAuthId);
}