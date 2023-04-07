package com.kyusung.userservice.entity.common;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Getter
@MappedSuperclass
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BaseEntity {
//    boolean isActive = true;
//    boolean isDelete = false;
    @CreationTimestamp
    Timestamp createdAt;
    @UpdateTimestamp
    Timestamp updatedAt;
}
