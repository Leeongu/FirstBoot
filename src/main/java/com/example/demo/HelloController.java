package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Leeon on 17/8/7.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello Leeon";
    }
}
