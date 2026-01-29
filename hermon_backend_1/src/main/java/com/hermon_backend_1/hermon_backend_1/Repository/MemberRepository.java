package com.hermon_backend_1.hermon_backend_1.Repository;

import com.hermon_backend_1.hermon_backend_1.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

}
