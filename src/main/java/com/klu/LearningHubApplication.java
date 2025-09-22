package com.klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LearningHubApplication extends SpringBootServletInitializer {

    // This method is needed for WAR deployment
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LearningHubApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(LearningHubApplication.class, args);
    }
}
