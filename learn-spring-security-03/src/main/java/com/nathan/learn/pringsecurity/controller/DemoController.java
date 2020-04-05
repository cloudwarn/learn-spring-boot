package com.nathan.learn.pringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @PermitAll
    @GetMapping("/echo")
    public String echo() {
        return "hello world";
    }



}
