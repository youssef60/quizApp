package com.example.quizzapp.controllers;

import com.example.quizzapp.controllers.api.SeanceApi;
import com.example.quizzapp.models.Seance;
import com.example.quizzapp.services.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class SeanceController  implements SeanceApi {

    @Autowired
    SeanceService seanceService;


    @Override
    public List<Seance> getAll() {
        return seanceService.getAll();
    }

    @Override
    public Seance save(Seance seance) {
        return seanceService.save(seance);
    }

    @Override
    public void delete(Long id) {
        seanceService.delete(id);
    }

    @Override
    public Optional<Seance> getById(Long id) {
        return seanceService.getById(id);
    }
}
