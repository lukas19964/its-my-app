package com.example.myfirstapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResources {

    @GetMapping(path = "/api/hello")
    public String hello() {
        return "Hello world on server";
    }
}
