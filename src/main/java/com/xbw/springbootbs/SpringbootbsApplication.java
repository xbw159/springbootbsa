package com.xbw.springbootbs;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringbootbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootbsApplication.class, args);
    }

}
