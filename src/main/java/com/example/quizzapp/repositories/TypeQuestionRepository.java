package com.example.quizzapp.repositories;

import com.example.quizzapp.models.TypeQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizzapp.models.TypeQuestion;

@Repository
public interface TypeQuestionRepository extends JpaRepository<TypeQuestion,Long > {
	
	
	

}
