package com.sirdarey.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "sirdarey2",
            groupId = "sirdarey_group"
    )
    void listener (String data) {
        System.out.println("Listener received: " +data + " :)");
    }
}
