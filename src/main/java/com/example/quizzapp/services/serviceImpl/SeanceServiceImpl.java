package com.example.quizzapp.services.serviceImpl;

import com.example.quizzapp.models.Seance;
import com.example.quizzapp.repositories.SeanceRepository;
import com.example.quizzapp.services.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeanceServiceImpl  implements SeanceService {

    @Autowired
    SeanceRepository seanceRepository;

    @Override
    public List<Seance> getAll() {
        return seanceRepository.findAll();
    }

    @Override
    public Seance save(Seance seance) {
        return seanceRepository.save(seance);
    }

    @Override
    public void delete(Long id) {
            seanceRepository.deleteById(id);
    }

    @Override
    public Optional<Seance> getById(Long id) {
        return seanceRepository.findById(id);
    }
}
