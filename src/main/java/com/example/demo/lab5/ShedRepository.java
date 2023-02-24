package com.example.demo.lab5;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.lab5.CassandraModel.Shedule;

import java.util.UUID;

public interface ShedRepository extends CrudRepository<Shedule,UUID> {
    
}
