package com.example.demo.models;

public class Greetings {
    private String greeting;

    public Greetings() {
        this.greeting = "hello world";
    }

    public String getGreeting() {
        return greeting;
    }

    public String setGreeting(String greeting) {
        return this.greeting = greeting;
    };
}
