package com.example.demo.lab5.CassandraModel;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.oss.driver.api.core.uuid.Uuids;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Table("shedule")
@Data
public class Shedule {

    // private UUID id = Uuids.timeBased();
    Long id;
    private String movie;
    private String format;
    
    @Pattern(regexp = "^([0-9]{2}:[0-9]{2}:[0-9]{2})$")
    private String startShaw;
    private int minPrice;

    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
    private Date createdAt = new Date();

    public  Shedule(Long id, String movie, String format, String startShaw, int minPrice){
        this.id = id;
        this.movie = movie;
        this.format = format;
        this.startShaw = startShaw;
        this.minPrice = minPrice;
    }


    
}
