package com.ipldugout.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MyProjectApplication
    extends ServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MyProjectApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

}
