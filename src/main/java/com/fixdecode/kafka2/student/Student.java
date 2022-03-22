package com.fixdecode.kafka2.student;

import lombok.Data;

import java.util.UUID;

@Data
public class Student {
    private UUID id;
    private String name;
    private String department;

    public Student(String name, String department) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.department = department;
    }
}
