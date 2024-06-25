package com.chobolevel.springbootdeveloper;

import com.chobolevel.springbootdeveloper.config.jwt.JwtProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(JwtProperties.class)
@SpringBootApplication
public class SpringbootDeveloperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDeveloperApplication.class, args);
    }

}
