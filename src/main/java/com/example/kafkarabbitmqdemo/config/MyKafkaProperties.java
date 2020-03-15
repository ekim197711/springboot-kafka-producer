package com.example.kafkarabbitmqdemo.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("mykafka")
public class MyKafkaProperties {
    private String bootstrapAddress;
}
