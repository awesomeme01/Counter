package com.example.demo.controller;

import com.example.demo.model.Request;
import com.example.demo.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    RequestService requestService;

    @GetMapping(path = "/report")
    public List<Request> getAll(){
        return requestService.getAll();
    }
    @GetMapping(path = "/counter")
    public Integer getCounter(){
        return requestService.getCounter();
    }
    @PostMapping(path = "/counter")
    public Request postCounter(){
        return requestService.postCounter(new Request("POST", LocalDateTime.now()));
    }
}
