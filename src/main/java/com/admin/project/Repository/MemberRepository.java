package com.admin.project.Repository;

import com.admin.project.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // UserDetailService에서 username 으로 검색할 수 있도록 메서드를 만들어준다.
    Optional<Member> findByusername(String username);
}
