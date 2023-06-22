package br.senai.lab365.demospringboot.controllers;

import br.senai.lab365.demospringboot.dtos.PetGetRequest;
import br.senai.lab365.demospringboot.models.Pet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets")
public class PetController {

    @GetMapping
    public String buscaPets(@RequestParam(required = false) String especie,
                            @RequestParam(required = false) String raca) {
        if (especie != null && especie.length() > 0) {
            return "lista de pets da espécie: " + especie;
        } else {
            return "lista completa de pets";
        }
    }

    @GetMapping("/filtro-por-dto")
    public String buscaPetsParametersDTO(PetGetRequest params) {
        if (params != null && params.getEspecie() != null && params.getEspecie().length() > 0) {
            return "lista de pets da espécie: " + params.getEspecie();
        } else {
            return "lista completa de pets";
        }
    }

    @PostMapping
    public Pet cadastraPet(@RequestBody Pet novoPet) {
        return novoPet;
    }

    @GetMapping("/{idPet}")
    public String buscaPet(@PathVariable("idPet") int id) {
        return "este é um pet com id: " + id;
    }

    @PostMapping("/vacina")
    public String cadastraVacina() {
        return "vacina cadastrada";
    }

    @PutMapping("/{id}")
    public String atualizaPet() {
        return "pet atualizado";
    }

}
