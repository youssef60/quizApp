package com.example.quizzapp.services.serviceImpl;

import com.example.quizzapp.models.Reponse;
import com.example.quizzapp.repositories.ReponseRepository;
import com.example.quizzapp.services.ReponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponseServiceImpl implements ReponseService {

    @Autowired
    ReponseRepository reponseRepository;

    @Override
    public List<Reponse> getAll() {
        return reponseRepository.findAll();
    }

    @Override
    public Reponse save(Reponse reponse) {
        return reponseRepository.save( reponse );
    }

    @Override
    public void delete(Long id) {

        reponseRepository.deleteById(id);
    }

    @Override
    public Optional<Reponse> getById(Long id) {
        return reponseRepository.findById(id);
    }
}
