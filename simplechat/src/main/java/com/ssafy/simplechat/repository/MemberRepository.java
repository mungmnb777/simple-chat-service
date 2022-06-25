package com.ssafy.simplechat.repository;

import com.ssafy.simplechat.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
