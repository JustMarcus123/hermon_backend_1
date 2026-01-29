package com.hermon_backend_1.hermon_backend_1.controller;


import com.hermon_backend_1.hermon_backend_1.Entity.Member;
import com.hermon_backend_1.hermon_backend_1.Service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/members")
@CrossOrigin(origins = "http://localhost:5173/")
@RequiredArgsConstructor
public class MemberController {

private final MemberService memberService;

@PostMapping
    public Member createMember(@RequestBody Member member){
    log.info("Post /api/members called");
    log.info("incoming member :{}", member);
    return memberService.addMember(member);
}

@GetMapping
    public List<Member> getMembers(){
    log.info("Get /api/members called");

    List<Member> members = memberService.getAllMembers();
    log.info("returning the members");
    return  members;
}

}
