package com.demo.microservices.limitservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Limits {

    private Integer minimum;
    private Integer maximum;
}
