package com.example.demo.lab2;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Ticket {
    private int id= (int)(Math.random()*999);

    @NotBlank(message="Введите название фильма!!!")
    private String film;

    @NotBlank(message="Выберите зал!")
    private String hall;

    @Min(1)
    @Max(40) 
    private int seat;


    @Min(1)
    @Max(25)  
    private int row;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public int getSeat(){
        return seat;
    }

    public void setSeat(int seat) {
        this.seat=seat;
    }

    public int getRow(){
        return row;
    }

    public void setRow(int row) {
        this.row=row;
    }

    public String getFilm(){
        return film;
    }

    public void setFilm(String film) {
        this.film=film;
    }

    public String getHall(){
        return hall;
    }

    public void setHall(String hall) {
        this.hall=hall;
    }

}
