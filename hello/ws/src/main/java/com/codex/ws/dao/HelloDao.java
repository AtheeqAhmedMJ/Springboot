package com.codex.ws.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {
    public String getHelloMessage() {
        return "Hello, world!";
    }
}
