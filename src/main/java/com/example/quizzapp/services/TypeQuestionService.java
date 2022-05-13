package com.example.quizzapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizzapp.models.TypeQuestion;
import com.example.quizzapp.repositories.TypeQuestionRepository;

@Service
public interface TypeQuestionService {

	
	public List<TypeQuestion> getAll();

	public TypeQuestion save(TypeQuestion typeQuestion);

	public  void delete(Long id );


	public TypeQuestion getById(Long id);



	

}
