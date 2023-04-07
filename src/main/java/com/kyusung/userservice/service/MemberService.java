package com.kyusung.userservice.service;

import com.kyusung.userservice.dto.MemberResDto;
import com.kyusung.userservice.exception.ResourceNotFoundException;
import com.kyusung.userservice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public List<MemberResDto> getMembers() {
        return memberRepository.findAll().stream().map(MemberResDto::new)
                .collect(Collectors.toList());
    }

    public MemberResDto getMembers(Long id) {
        return new MemberResDto(memberRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("해당 사용자가 없습니다. id=" + id)
        ));
    }
}
