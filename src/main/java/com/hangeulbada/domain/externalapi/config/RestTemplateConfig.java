package com.hangeulbada.domain.externalapi.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import java.time.Duration;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .setConnectTimeout(Duration.ofSeconds(5)) // 연결 타임아웃
                .setReadTimeout(Duration.ofSeconds(50)) // 읽기 타임아웃
                .build();
        return restTemplate;
    }
}