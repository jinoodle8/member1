package com.example.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "member_schedule") //database에 해당 이름의 테이블 생성
public class ScheduleEntity { //table 역할
    //jpa ==> database를 객체처럼 사용 가능

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(unique = true)
    private String MemberId;

    @Column
    private String Day;

    @Column
    private String Schedule;
}
