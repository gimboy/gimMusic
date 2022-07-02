package com.gimMusic.gimMusic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @GetMapping("/home")
    public String goHome() {
        return "index";
    }

}
