package com.functional.kafka.function;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class FunctionExample {

    @Bean
    public Consumer<String> listen() {
        return message -> {
            log.info("{}", message);
        };
    }

    //@Bean
    public Consumer<KStream<String, String>> processStream() {
        return stream -> stream
                .mapValues((key, value) -> {
                    log.info("Key: {}", key);
                    return value;
                });
    }
}
