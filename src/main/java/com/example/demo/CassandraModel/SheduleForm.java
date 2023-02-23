package com.example.demo.CassandraModel;

import java.util.UUID;

import lombok.Data;

@Data
public class SheduleForm {
    
    private UUID id;
    private String movie;
    private String format;
    private String startShaw;
    private int minPrice;
}
