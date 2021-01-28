package com.admin.project.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.plaf.metal.MetalMenuBarUI;

@NoArgsConstructor
@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;

    @Builder
    public Member(Long id, String username, String name, String password, String email, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Member 객체로 반환
    public Member toEntity() {
        return Member.builder()
                .id(id)
                .password(password)
                .username(username)
                .name(name)
                .email(email)
                .phoneNumber(phoneNumber)
                .build();
    }
}
