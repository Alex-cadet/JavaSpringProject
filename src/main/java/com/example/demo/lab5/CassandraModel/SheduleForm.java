package com.example.demo.lab5.CassandraModel;

import java.util.UUID;

// import lombok.Data;

// @Data
public class SheduleForm {
    
    private UUID id;
    private String movie;
    private String format;
    private String startShaw;
    private int minPrice;

    public UUID getId(){
        return id;
    }

    public void setId(UUID id){
        this.id = id;
    }

    public String getMovie(){
        return movie;
    }

    public void setMovie(String movie){
        this.movie = movie;
    }

    public String getFormat(){
        return format;
    }

    public void setFormat(String format){
        this.format = format;
    }

    public String getStartShaw(){
        return startShaw;
    }

    public void setStartShaw(String startShaw){
        this.startShaw = startShaw;
    }

    public int getMinPrice(){
        return minPrice;
    }

    public void setMinPrice(int minPrice){
        this.minPrice = minPrice;
    }

}
