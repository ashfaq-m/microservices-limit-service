package com.demo.microservices.limitservice.controller;

import com.demo.microservices.limitservice.entity.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LimitsController {

    @GetMapping("limits")
    public Limits getLimits(){
        return new Limits(2, 88);
    }
}