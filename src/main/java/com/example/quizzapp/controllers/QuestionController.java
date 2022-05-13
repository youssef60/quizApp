package com.example.quizzapp.controllers;

import com.example.quizzapp.controllers.api.QuestionApi;
import com.example.quizzapp.models.Question;
import com.example.quizzapp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class QuestionController implements QuestionApi {

    @Autowired
    QuestionService questionService;

    @Override
    public List<Question> getAll() {
        return questionService.getAll();
    }

    @Override
    public Question save(Question question) {
        return questionService.save(question);
    }

    @Override
    public void delete(Long id) {
        questionService.delete(id);
    }

    @Override
    public Optional<Question> getById(Long id) {
        return questionService.getById(id);
    }
}
