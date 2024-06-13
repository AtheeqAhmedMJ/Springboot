package com.codex.ws.service;

import com.codex.ws.dao.HelloDao;
import com.codex.ws.dto.HelloDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private HelloDao helloDao;

    public HelloDto getHelloMessage() {
        String message = helloDao.getHelloMessage();
        return new HelloDto(message);
    }
}
