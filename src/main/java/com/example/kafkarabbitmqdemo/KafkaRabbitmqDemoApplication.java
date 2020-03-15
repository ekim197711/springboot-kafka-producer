package com.example.kafkarabbitmqdemo;

import com.example.kafkarabbitmqdemo.config.MyKafkaProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties(value={MyKafkaProperties.class})
@EnableScheduling
public class KafkaRabbitmqDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaRabbitmqDemoApplication.class, args);
    }

}
