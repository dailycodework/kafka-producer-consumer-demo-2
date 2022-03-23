package com.fixdecode.kafka2.config;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerConfig {

    @KafkaListener(topics = "students", groupId = "studentsGroupId")
    public void listener(String student){
        System.out.println("Listener Received a new message from : "+ student);
    }
}
// .\bin\windows\kafka-console-consumer.sh --topic students --from-beginning --bootstrap-server localhost:9092