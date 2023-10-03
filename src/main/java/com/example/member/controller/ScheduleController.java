package com.example.member.controller;

import com.example.member.entity.ScheduleEntity;
import com.example.member.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScheduleController {

    @Autowired
    private ScheduleRepository scheduleRepository;

    @PostMapping("/addSchedule")
    public String addSchedule(ScheduleEntity schedule) {
        scheduleRepository.save(schedule);
        return "redirect:/";
    }
}
