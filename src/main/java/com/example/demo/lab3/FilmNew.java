package com.example.demo.lab3;

import lombok.Data;

@Data
public class FilmNew {
    private String id;
    private String title;
    private String genre;

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
}
