package org.example.javacoreandspringpractise.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class RestControllerTest {
    private final RestPractise restPractise;

    public RestControllerTest(@Autowired RestPractise restPractise) {
        this.restPractise = restPractise;
    }

    @GetMapping
    public void send() {
        restPractise.send();
    }
}
