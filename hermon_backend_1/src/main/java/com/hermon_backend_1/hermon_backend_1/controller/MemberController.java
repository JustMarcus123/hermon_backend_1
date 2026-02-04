package com.hermon_backend_1.hermon_backend_1.controller;

import com.hermon_backend_1.hermon_backend_1.Entity.MemberEntity;
import com.hermon_backend_1.hermon_backend_1.Service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173/")

public class MemberController {

private final MemberService memberService;

@PostMapping
public MemberEntity createMember(@RequestBody MemberEntity memberEntity){
    log.info("Post API called");
    log.info("Incoming Member :{}", memberEntity );
    MemberEntity saved = memberService.addMember(memberEntity);

    log.info("Member saved with ID:{}", saved.getId());

    return saved;
}

@GetMapping
public List<MemberEntity> getMembers(){

    log.info("get/api/members called");

    List<MemberEntity> memberEntities= memberService.getAllMembers();

    log.info("Returning members :{}", memberEntities.size());
    return memberEntities;
}

}
