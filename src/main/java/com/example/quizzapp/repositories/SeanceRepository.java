package com.example.quizzapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizzapp.models.Seance;

@Repository
public interface SeanceRepository extends JpaRepository<Seance,Long > {
	
	
	

}
