package com.example.demo.service;

import com.example.demo.model.Request;
import com.example.demo.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class RequestService {
    @Autowired
    RequestRepository requestRepository;

    public List<Request> getAll(){
        return requestRepository.findAll();
    }
    public Integer getCounter(){
        return requestRepository.getCount();
    }
    public Request postCounter(Request request){
        return requestRepository.save(new Request("POST", LocalDateTime.now()));
    }
}
