package com.my.sq.practice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.my.sq.practice.circular.dependency" })
public class TestConfig {
}