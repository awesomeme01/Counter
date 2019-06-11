package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@Entity
@Table(name = "requests_0")
public class Request {
    @Id
    @GeneratedValue
    private Long id;
    private String requestType;
    private LocalDateTime time;

    public Request(String requestType, LocalDateTime time) {
        this.requestType = requestType;
        this.time = time;
    }
}
