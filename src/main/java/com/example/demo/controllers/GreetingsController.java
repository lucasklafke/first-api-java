package com.example.demo.controllers;

import com.example.demo.models.Greetings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    private static final String template = "hello";

    @RequestMapping("/greeting")
    public Greetings Greeting() {
      return new Greetings();
    };
}
