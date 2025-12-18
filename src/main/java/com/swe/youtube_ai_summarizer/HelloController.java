package com.swe.youtube_ai_summarizer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "🚀 YouTube AI Summarizer - Google SWE Style";
    }

    @GetMapping("/health")
    public String health() {
        return "{\"status\":\"alive\",\"project\":\"Week 1 Day 1\"}";
    }
}
