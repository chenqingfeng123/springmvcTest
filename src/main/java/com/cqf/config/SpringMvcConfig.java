package com.cqf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//springmvc配置类，本质上还是一个spring配置类
@Configuration
@ComponentScan({"com.cqf.controller","com.cqf.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
