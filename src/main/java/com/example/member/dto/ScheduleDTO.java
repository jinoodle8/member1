package com.example.member.dto;

import com.example.member.entity.ScheduleEntity;
import jakarta.persistence.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

@Entity
@Table(name = "schedule")
@Getter
@Setter
public class ScheduleDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    private String name;

    public static {
        // 폼 데이터 받아오기
        String email = request.getParameter("Id");
        String password = request.getParameter("Day");
        String name = request.getParameter("Schedule");

        // ScheduleEntity 객체 생성 및 값 설정
        ScheduleDTO schedule = new ScheduleDTO();
        schedule.setEmail(email);
        schedule.setPassword(password);
        schedule.setName(name);

        // 스케줄 저장 등 추가 작업 수행
    }
}



