package com.example.quizzapp.controllers.api;

import com.example.quizzapp.models.Seance;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface SeanceApi {

    @GetMapping("/seances/all")
    public List<Seance> getAll();

    @PostMapping("/seances/add")
    public Seance save(@RequestBody Seance seance);

    @DeleteMapping("/seances/delete/{idSeance}")
    public  void delete(@PathVariable("idSeance") Long id );

    @GetMapping("/seances/{idSeance}")
    public Optional<Seance> getById(@PathVariable("idSeance") Long id);
}
