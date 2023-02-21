package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class CinemaApplication {
                
                  public static void main(String[] args) {
                    SpringApplication.run(CinemaApplication.class, args);

                    // ApplicationContext context = SpringApplication.run(CinemaApplication.class, args);
                    // FilmNewDAO filmNewDAO = context.getBean(FilmNewImpl.class);
                    // FilmNew filmNew = new FilmNew();
                    // filmNew.setId("9999");
                    // filmNew.setTitle("Начало ");
                    // filmNew.setGenre("Фантастика");
                    // filmNewDAO.insertFilmNew(filmNew);
                  };
              }