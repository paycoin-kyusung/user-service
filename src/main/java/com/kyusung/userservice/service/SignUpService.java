package com.kyusung.userservice.service;

import com.kyusung.userservice.dto.SignUpReqDto;
import com.kyusung.userservice.dto.SignUpResDto;
import com.kyusung.userservice.entity.MemberEntity;
import com.kyusung.userservice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpService {
    private final MemberRepository memberRepository;

    public SignUpResDto signup(SignUpReqDto signUpReqDto) {
        String code = generateCode();
        MemberEntity memberEntity = memberRepository.save(signUpReqDto.toMemberEntity(code));
        return new SignUpResDto(memberEntity);
    }

    private String generateCode() {
        String code = RandomStringUtils.randomAlphanumeric(6);
        while (memberRepository.findByCode(code).isPresent()) {
            code = RandomStringUtils.randomAlphanumeric(6);
        }
        return code;
    }
}
