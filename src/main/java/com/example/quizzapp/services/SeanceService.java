package com.example.quizzapp.services;

import java.util.List;
import java.util.Optional;

import com.example.quizzapp.models.Seance;


public interface SeanceService {

    public List<Seance> getAll();


    public Seance save(Seance seance);

    public  void delete(Long id );

    public Optional<Seance> getById(Long id);
	


}
