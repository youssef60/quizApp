package com.example.quizzapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizzapp.models.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long > {
	
	
	

}
