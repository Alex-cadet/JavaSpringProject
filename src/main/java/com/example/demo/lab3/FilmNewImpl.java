// package com.example.demo.lab3;
// import java.util.HashMap;
// import java.util.Map;

// import javax.sql.DataSource;
// import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
// import org.springframework.stereotype.Repository;
// import org.springframework.beans.factory.annotation.Autowired;

// @Repository
// public class FilmNewImpl implements FilmNewDAO {
//     DataSource dataSource;
//     SimpleJdbcInsert inserFilm;

//     @Autowired
//     public void setDataSource(DataSource dataSource){
//         this.dataSource = dataSource;
//         inserFilm = new SimpleJdbcInsert(dataSource).withTableName("t_FilmNew")
//         .usingColumns("id","title","genre");
//     }

//     @Override
//     public void insertFilmNew(FilmNew filmNew){
//         Map<String,Object> par = new HashMap<String,Object>();
//         par.put("id", filmNew.getId());
//         par.put("title", filmNew.getTitle());
//         par.put("genre", filmNew.getGenre());
//         inserFilm.execute(par);
//     }

    
// }
