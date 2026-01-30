package com.hermon_backend_1.hermon_backend_1.Service;

import com.hermon_backend_1.hermon_backend_1.Entity.MemberEntity;
import com.hermon_backend_1.hermon_backend_1.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

//    public MemberEntity addMember(MemberEntity memberEntity){
//        return memberRepository.save(memberEntity);
//    }

    public  MemberEntity addMember(MemberEntity memberEntity){
        return memberRepository.save(memberEntity);
    }

    public List<MemberEntity> getAllMembers(){
        return memberRepository.findAll();
    }

}
