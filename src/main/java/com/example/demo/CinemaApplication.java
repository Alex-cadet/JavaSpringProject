package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.example.demo.lab5.ShedRepository;
import com.example.demo.lab5.CassandraModel.Shedule;
import java.util.Arrays;
// import org.springframework.context.ApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class CinemaApplication {
                
                  public static void main(String[] args) {
                    SpringApplication.run(CinemaApplication.class, args);
                  };
                    // ApplicationContext context = SpringApplication.run(CinemaApplication.class, args);
                    // FilmNewDAO filmNewDAO = context.getBean(FilmNewImpl.class);
                    // FilmNew filmNew = new FilmNew();
                    // filmNew.setId("9999");
                    // filmNew.setTitle("Начало ");
                    // filmNew.setGenre("Фантастика");
                    // filmNewDAO.insertFilmNew(filmNew);


  @Bean
	public CommandLineRunner clr(ShedRepository shedRepository) {
		return args -> {

			// save books in the database
			shedRepository.saveAll(Arrays.asList(
					new Shedule(1L,"Обман", "2D","10:30:00",350)
			));


			//get all the books
			shedRepository.findAll().forEach(System.out::println);

		};
              }
            }