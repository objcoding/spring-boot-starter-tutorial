package com.objcoding.startersamples.helloworld;

import com.objcoding.starters.helloworld.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenghui.zhang on 2018/2/2.
 */
@RestController
@SpringBootApplication
public class HelloworldApplication {

    @Autowired
    private HelloworldService helloworldService;

    @RequestMapping("/")
    public String sayHello() {
        return helloworldService.sayHello();
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);

    }
}
