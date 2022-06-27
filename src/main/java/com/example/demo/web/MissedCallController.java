package com.example.demo.web;

import com.example.demo.services.MissedCallService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/missed_call")
public class MissedCallController {
    private final MissedCallService missedCallService;

    public MissedCallController(MissedCallService missedCallService) {
        this.missedCallService = missedCallService;
    }

    @GetMapping("/")
    String home(){
        return "Missed Cal Home";
    }
    @GetMapping("/find/all")
    List<String> findAll(){
        return missedCallService.findAll();
    }
}
