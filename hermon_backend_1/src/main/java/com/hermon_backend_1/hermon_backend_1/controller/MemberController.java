package com.hermon_backend_1.hermon_backend_1.controller;

import com.hermon_backend_1.hermon_backend_1.Entity.MemberEntity;
import com.hermon_backend_1.hermon_backend_1.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173/")

public class MemberController {

private final MemberService memberService;

@PostMapping
public MemberEntity createMember(@RequestBody MemberEntity memberEntity){
    return memberService.addMember(memberEntity);
}

@GetMapping
public List<MemberEntity> getMembers(){
    return memberService.getAllMembers();
}

}
