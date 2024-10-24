package com.githubactiontest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/startUp")
    public String startUp() {
        return "Y";
    }

    @GetMapping("/test")
    public String helloWorld(){
        return "hello world";
    }
}
