package com.kyusung.userservice.controller;

import com.kyusung.userservice.dto.MemberResDto;
import com.kyusung.userservice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public ResponseEntity<List<MemberResDto>> getMembers() {
        return ResponseEntity.ok().body(memberService.getMembers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberResDto> getMembers(@PathVariable Long id) {
        return ResponseEntity.ok().body(memberService.getMembers(id));
    }
}
