package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.CassandraModel.Shedule;

import java.util.UUID;

public interface ShedRepository extends CrudRepository<Shedule,UUID> {
    
}
