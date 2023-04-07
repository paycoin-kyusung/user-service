package com.kyusung.userservice.dto;


import com.kyusung.userservice.entity.MemberEntity;
import com.kyusung.userservice.enums.Sex;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@ToString
public class SignUpReqDto {
    @NotEmpty
    String name;
    @NotEmpty
    String birth;
    @NotEmpty
    Sex sex;
    @NotEmpty
    String phone;
    @NotEmpty
    String password;
    String email;

    public MemberEntity toMemberEntity(String code) {
        return MemberEntity.builder()
                .name(name)
                .birth(birth)
                .sex(sex)
                .phone(phone)
                .password(password)
                .code(code)
                .email(email)
                .signUpDate(new Timestamp(System.currentTimeMillis()))
                .build();
    }
}
