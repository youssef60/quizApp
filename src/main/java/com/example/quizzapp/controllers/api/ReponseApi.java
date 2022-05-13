package com.example.quizzapp.controllers.api;

import com.example.quizzapp.models.Reponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ReponseApi {

    @GetMapping("/reponses/all")
    public List<Reponse> getAll();

    @PostMapping("/reponses/add")
    public Reponse save(@RequestBody Reponse reponse);

    @DeleteMapping("/reponses/delete/{idReponse}")
    public  void delete(@PathVariable("idReponse") Long id );

    @GetMapping("/responses/{idReponse}")
    public Optional<Reponse> getById(@PathVariable("idReponse") Long id);
}
