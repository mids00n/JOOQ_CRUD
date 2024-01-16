package com.example.dada;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class  Test{

    @GetMapping
    public String getTestMessage() {
        return "Hello, this is a test message!";
    }
}
