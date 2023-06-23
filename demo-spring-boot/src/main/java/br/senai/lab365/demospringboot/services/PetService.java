package br.senai.lab365.demospringboot.services;

import br.senai.lab365.demospringboot.models.Tutor;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    public void associaTutor(int idPet, Tutor tutor) {
        // TODO: busca no TutorRepository se o tutor informado existe
        // se existir, busca no PetRepository o pet com o id informado
        // atualiza o atributo "tutor" do pet encontrado pelo objeto "tutor" recebido nesse request
    }
}
