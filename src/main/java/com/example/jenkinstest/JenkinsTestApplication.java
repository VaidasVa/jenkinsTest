package com.example.jenkinstest;

import com.example.jenkinstest.service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {
    private final static TestService testService = new TestService();

    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
        testService.printer();
        System.exit(0);
    }

}
