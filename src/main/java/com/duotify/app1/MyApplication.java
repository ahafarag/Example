package com.duotify.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MyApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/hello-world") 
    String HelloWorld(){ 
        return "Hello World"; 
    }
    public static void main(String[] args) {
        System.getProperties().put( "server.port", 9090 );  
        SpringApplication.run(MyApplication.class, args);
    }

}