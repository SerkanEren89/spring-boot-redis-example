package com.serkaneren.redis.demo.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Student")
@Data
public class Student {

    private Long id;

    private String firstName;

    private String lastName;

    private String address;
}
