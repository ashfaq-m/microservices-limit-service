package com.demo.microservices.limitservice.controller;

import com.demo.microservices.limitservice.config.Configuration;
import com.demo.microservices.limitservice.entity.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("limits")
    public Limits getLimits(){
        return new Limits(
                configuration.getMinimum(),
                configuration.getMaximum()
        );
    }
}
