package com.codex.ws.controller;

import com.codex.ws.dto.HelloDto;
import com.codex.ws.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping
    public HelloDto getHello() {
        return helloService.getHelloMessage();
    }
}
