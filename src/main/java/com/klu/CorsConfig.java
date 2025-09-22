package com.klu;  // matches your existing package

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://3.87.77.146:9090")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}
