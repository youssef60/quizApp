package com.example.quizzapp.services;

import java.util.List;
import java.util.Optional;

import com.example.quizzapp.models.Reponse;


public interface ReponseService {

	public List<Reponse> getAll();

	public Reponse save(Reponse reponse);

	public  void delete(Long id );

	public Optional<Reponse> getById(Long id);

	

}
