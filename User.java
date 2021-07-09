package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity    // == table
            // @Table(name = "user") : 클래스 이름과 테이블 이름이 같으면 생략 가능
public class User {

    // pk(식별자) 설정
    @Id

    // 어떤 식으로 키 전략을 가져갈지 설정하는 부분, IDENTITY/AUTO/TABLE/SEQUENCE 4개 타입이 있는데 mysql을 사용하므로 IDENTITY로 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // @Column(name = "id") : 선언한 변수 이름과 테이블 컬럼 이름이 같으면 생략 가능
    private Long id;

    private String account;

    private String password;

    private String status;

    private String email;

    private String phoneNumber;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

}
