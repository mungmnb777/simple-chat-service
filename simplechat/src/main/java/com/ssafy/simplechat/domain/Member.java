package com.ssafy.simplechat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String memberId;

    private String password;

    private String nickname;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
