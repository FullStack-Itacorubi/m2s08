package repositories;

import java.util.ArrayList;
import java.util.List;

import models.Pet;

public class PetRepository {
	private static List<Pet> pets = new ArrayList<>();
	private static int petSequence = 0;
	
	private static int incrementaSequence() {
		return ++petSequence;
	}
	
	public void cadastra(Pet pet) {
		pet.setId(incrementaSequence());
		pets.add(pet);
	}
	
	public List<Pet> busca() {
		return pets;
	}
	
	public boolean deleta(int id) {
		//TODO: percorrer a lista procurando um pet com esse id
		// quando encontrar, deleta da lista e retorna true
		// se não encontrar, retorna false
		
		return false;
	}

}
