package com.chobolevel.springbootdeveloper.repository;

import com.chobolevel.springbootdeveloper.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
