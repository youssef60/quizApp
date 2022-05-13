package com.example.quizzapp.services.serviceImpl;

import com.example.quizzapp.models.Question;
import com.example.quizzapp.repositories.QuestionRepository;
import com.example.quizzapp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl  implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public void delete(Long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public Optional<Question> getById(Long id) {
        return questionRepository.findById(id);
    }
}
