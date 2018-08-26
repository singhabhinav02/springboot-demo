package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String getHello() {
        return "Hi there";
    }

    @RequestMapping(value = "/greet/{name}", method = RequestMethod.GET)
    public String greet(@PathVariable String name) {
        return "Hello " + name + "!!";
    }

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String howAreYou(@RequestParam String name) {
        return "How are you " + name + "?";
    }
}
