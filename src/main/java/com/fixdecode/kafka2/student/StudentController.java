package com.fixdecode.kafka2.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/students")
@AllArgsConstructor
public class StudentController {
    
    private final StudentService studentService;
    
    @PostMapping
    public void publish(@RequestBody Student student){
        studentService.publish(student);
    }
}
