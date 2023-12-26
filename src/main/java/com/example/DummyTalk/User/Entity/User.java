package com.example.DummyTalk.User.Entity;


import com.example.DummyTalk.Common.Entity.BaseTimeEntity;
import com.example.DummyTalk.User.Repository.UserRepository;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.annotation.CreatedDate;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "User")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "name")
    private String name;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "password")
    private String password;

    @Column(name = "nickname", nullable = true)
    private String nickname;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name= "credential", length = 500)
    private String credential;

    @Column(name = "user_img_path")
    private String userImgPath;

    @Column(name = "user_secret_key")
    private byte[] userSecretKey;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "nation_language")
    private String nationalLanguage;

    /* 유저와 서버의 관계 */
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<UserChat> userChats = new ArrayList<>();

    @OneToMany(mappedBy = "friendId")
    private List<Friend> friend = new ArrayList<>();
}