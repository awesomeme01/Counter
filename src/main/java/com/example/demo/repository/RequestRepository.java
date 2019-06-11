package com.example.demo.repository;

import com.example.demo.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface RequestRepository extends JpaRepository<Request,Long> {
    @Query("SELECT count(*) FROM Request")
    public Integer getCount();
}
