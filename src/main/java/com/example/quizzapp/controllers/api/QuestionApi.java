package com.example.quizzapp.controllers.api;

import com.example.quizzapp.models.Question;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface QuestionApi {

    @GetMapping("/questions/all")
    public List<Question> getAll();

    @PostMapping("/questions/add")
    public Question save(@RequestBody Question question);

    @DeleteMapping("/questions/delete/{idQuestion}")
    public  void delete( @PathVariable("idQuestion") Long id );

    @GetMapping("/questions/{idQuestion}")
    public Optional<Question> getById(@PathVariable("idQuestion") Long id);
}
