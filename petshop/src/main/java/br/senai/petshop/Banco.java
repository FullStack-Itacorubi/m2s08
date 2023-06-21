package br.senai.petshop;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Pet> pets = new ArrayList<>();
	private static int id = 0;
	
	public static void salva(Pet pet) {
		if (pet != null) {
			pet.setId(++id);
			pets.add(pet);
		}
	}
	
	public static List<Pet> busca() {
		return pets;
	}

}
