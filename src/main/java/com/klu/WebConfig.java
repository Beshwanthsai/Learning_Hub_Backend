package com.klu;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")   // Allows any origin, including subdomains
                .allowedMethods("*")          // Allow all HTTP methods
                .allowedHeaders("*")          // Allow all headers
                .allowCredentials(true);      // Allow credentials (cookies, auth headers)
    }
}
