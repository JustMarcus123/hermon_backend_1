package com.hermon_backend_1.hermon_backend_1.Service;

import com.hermon_backend_1.hermon_backend_1.Entity.Member;
import com.hermon_backend_1.hermon_backend_1.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member addMember(Member member){
        return memberRepository.save(member);
    }

    public List<Member>getAllMembers(){
        return memberRepository.findAll();
    }

}
