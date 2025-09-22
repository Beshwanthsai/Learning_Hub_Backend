package com.klu;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")   // Allow all origins
                .allowedMethods("*")          // Allow GET, POST, PUT, DELETE, etc.
                .allowedHeaders("*")          // Allow all headers
                .allowCredentials(true);      // Allow cookies/auth headers
    }
}
