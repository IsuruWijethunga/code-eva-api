package com.codeeva.codeeva.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping(path = "/health")
    public Map<String, String> hello() {
        return Map.of(
          "status", "UP"
        );
    }
}
