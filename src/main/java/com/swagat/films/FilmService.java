package com.swagat.films;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;
    public List<film> allFilms(){
      //System.out.println(filmRepository.findAll().toString());
      return filmRepository.findAll();
    }



    public Optional<film> singleFilm(String imdbId){
        return filmRepository.findFilmByimdbId(imdbId);
    }
}
