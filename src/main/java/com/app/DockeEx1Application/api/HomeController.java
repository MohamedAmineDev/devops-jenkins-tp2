package com.app.DockeEx1Application.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Welcome to DockerEx1Application";
    }

    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name) {
        return "Hello " + name + " !";
    }
}
