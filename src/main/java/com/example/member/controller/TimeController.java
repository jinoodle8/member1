package com.example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TimeController {
    @GetMapping("/member/time")
    public String time() {
        return "time";
    }

    @GetMapping("/member/add")
    public String AddScheule() {
        return "add";
    }
}
