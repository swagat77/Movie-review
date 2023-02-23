package com.swagat.films;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin(origins="http://localhost:8080")
@RequestMapping("/api/v1/movies")

public class FilmController {
    @Autowired
    private FilmService filmService;

    @GetMapping
    public ResponseEntity<List<film>> getAllFilms() {
        return new ResponseEntity<List<film>>(filmService.allFilms(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<film>> getSingleMovie(@PathVariable String imdbId) {
return new ResponseEntity<Optional<film>>(filmService.singleFilm(imdbId),HttpStatus.OK);
    }
}