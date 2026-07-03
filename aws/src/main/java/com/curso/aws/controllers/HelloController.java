package com.curso.aws.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return ResponseEntity.ok("Funcionando!");
    }
}