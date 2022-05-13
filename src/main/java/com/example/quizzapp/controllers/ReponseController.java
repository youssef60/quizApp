package com.example.quizzapp.controllers;

import com.example.quizzapp.controllers.api.ReponseApi;
import com.example.quizzapp.models.Reponse;
import com.example.quizzapp.services.ReponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ReponseController  implements ReponseApi {

    @Autowired
    ReponseService reponseService;

    @Override
    public List<Reponse> getAll() {
        return reponseService.getAll();
    }

    @Override
    public Reponse save(Reponse reponse) {
        return reponseService.save(reponse);
    }

    @Override
    public void delete(Long id) {
        reponseService.delete(id);
    }

    @Override
    public Optional<Reponse> getById(Long id) {
        return reponseService.getById(id);
    }
}
