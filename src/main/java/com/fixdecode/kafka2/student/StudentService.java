package com.fixdecode.kafka2.student;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void publish(Student student) {
        kafkaTemplate.send("students",
                new Student(student.getName(), student.getDepartment()));
    }
}
