package com.fixdecode.kafka2.student;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Student {
    private UUID id;
    private String name;
    private String department;

    public Student(String name, String department) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.department = department;
    }

    public Student() {
    }
}
