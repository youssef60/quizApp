package com.example.quizzapp.services;

import java.util.List;
import java.util.Optional;


import com.example.quizzapp.models.Question;


public interface QuestionService {

	public List<Question> getAll();

	public Question save(Question question);

	public  void delete(Long id );

	public Optional<Question> getById(Long id);
	

}
