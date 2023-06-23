package br.senai.lab365.demospringboot.services;

import br.senai.lab365.demospringboot.models.Tutor;
import br.senai.lab365.demospringboot.repositories.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorService {

    @Autowired private TutorRepository repository;

    public void cadastra(Tutor tutor) {
        repository.cadastra(tutor);
    }
}
