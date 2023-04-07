package com.kyusung.userservice.dto;

import com.kyusung.userservice.entity.MemberEntity;
import com.kyusung.userservice.enums.Sex;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@ToString
@NoArgsConstructor
public class MemberResDto {
    Long id;
    String name;
    String birth;
    Sex sex;
    String phone;
    String code;
    String email;
    Timestamp signUpDate;

    public MemberResDto(MemberEntity memberEntity) {
        this.id = memberEntity.getId();
        this.name = memberEntity.getName();
        this.birth = memberEntity.getBirth();
        this.sex = memberEntity.getSex();
        this.phone = memberEntity.getPhone();
        this.code = memberEntity.getCode();
        this.email = memberEntity.getEmail();
        this.signUpDate = memberEntity.getSignUpDate();
    }
}
