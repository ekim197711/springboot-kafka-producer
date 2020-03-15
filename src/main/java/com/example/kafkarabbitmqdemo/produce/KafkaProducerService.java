package com.example.kafkarabbitmqdemo.produce;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerService {
    private final KafkaTemplate kafkaTemplate;

    private static int runningId = 0;

    @Scheduled(fixedRate = 1000*10, initialDelay = 5*1000)
    public void produceMessage(){
        log.info("Produce Message - BEGIN");
        String message = String.format("hello %d this is a kafka message %s", runningId++,
                LocalDateTime.now().toString());
        kafkaTemplate.send("mike", message);
        log.info("Produce Message - END {}", message);
    }
}
