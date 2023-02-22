package com.example.demo.CassandraModel;

import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface shedRepository extends CrudRepository<Shedule,UUID> {
    
}
