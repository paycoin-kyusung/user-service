package com.kyusung.userservice.entity;

import com.kyusung.userservice.entity.common.BaseEntity;
import com.kyusung.userservice.enums.Sex;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String birth;
    @Column(nullable = false)
    Sex sex;
    @Column(nullable = false)
    String phone;
    @Column(nullable = false)
    String password;

    @Column(nullable = false, unique = true)
    String code;

    String email;

    Timestamp signUpDate;
}
