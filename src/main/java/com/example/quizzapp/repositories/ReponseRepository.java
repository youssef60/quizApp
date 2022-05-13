package com.example.quizzapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizzapp.models.Reponse;

@Repository
public interface ReponseRepository extends JpaRepository<Reponse,Long > {
	
	
	

}
