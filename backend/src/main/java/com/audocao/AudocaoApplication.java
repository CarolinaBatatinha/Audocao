package com.audocao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
@EnableConfigurationProperties

public class AudocaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AudocaoApplication.class, args);
        System.out.println("A API do Audoção foi iniciada com sucesso!");
        System.out.println("📝 Acesse: http://localhost:8080");
        System.out.println("🔐 Documentação Swagger: http://localhost:8080/swagger-ui.html");
    }
}
