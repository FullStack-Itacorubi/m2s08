package br.senai.lab365.demospringboot.controllers;

import br.senai.lab365.demospringboot.models.Pet;
import br.senai.lab365.demospringboot.models.Tutor;
import br.senai.lab365.demospringboot.services.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorService service;

    @PostMapping
    public void cadastra(@RequestBody Tutor tutor) {
        // TODO: salvar registro

        service.cadastra(tutor);
    }

    /*@DeleteMapping("/{idTutor}/pets/{idPet}")
    public void deletaPetDoTutor(@PathVariable int idTutor, @PathVariable int idPet) {

    }*/
}
