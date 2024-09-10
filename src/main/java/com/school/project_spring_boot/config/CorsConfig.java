package com.school.project_spring_boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://trandtrader.com", "http://trandtrader.com", "https://api.trandtrader.com", "http://api.trandtrader.com", "https://api.trandtrader.com/swagger-ui/index.html", "http://api.trandtrader.com/swagger-ui/index.html") // API 서버와 Swagger UI가 있는 도메인 허용
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP 메서드
                .allowedHeaders("*") // 허용할 HTTP 헤더
                .allowCredentials(true); // 클라이언트가 인증 정보를 포함하도록 허용
    }
}
