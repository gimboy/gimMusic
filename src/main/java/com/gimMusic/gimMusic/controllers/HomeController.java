package com.gimMusic.gimMusic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/music")
public class HomeController {

    @GetMapping()
    public String goHome() {
        return "musicView/music";
    }

}
