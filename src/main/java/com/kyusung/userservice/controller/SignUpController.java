package com.kyusung.userservice.controller;


import com.kyusung.userservice.dto.SignUpReqDto;
import com.kyusung.userservice.dto.SignUpResDto;
import com.kyusung.userservice.service.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/signup")
public class SignUpController {
    private final SignUpService signUpService;

    @PostMapping
    public ResponseEntity<SignUpResDto> signup(@RequestBody SignUpReqDto signUpReqDto) {
        return ResponseEntity.ok().body(signUpService.signup(signUpReqDto));
    }
}
