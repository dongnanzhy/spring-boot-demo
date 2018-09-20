package com.springlearner.girl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GirlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GirlApplication.class, args);
    }
}

//启动方法： 1. mvn spring-boot:run;
//         2. mvn install; java -jar target/girl-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod