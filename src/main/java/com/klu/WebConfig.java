package com.klu;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*") // or your EC2 IP like "http://50.17.70.148:9090"
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
