package com.yh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableScheduling
@EnableOpenApi
public class SpringbootDevDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDevDemoApplication.class, args);
    }

}
