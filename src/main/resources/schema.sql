DROP TABLE IF EXISTS FilmNew;

create table FilmNew (
id varchar(4) not null,
title varchar(25) not null,
genre varchar(20) not null,
duration varchar(10) not null,
country varchar(10) not null,
yearMade varchar(10) not null
);