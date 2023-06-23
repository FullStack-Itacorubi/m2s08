package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Pet;
import repositories.PetRepository;

@WebServlet("/BuscaPet")
public class BuscaPet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PetRepository repository = new PetRepository();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Pet> pets = repository.busca();
		PrintWriter writer = response.getWriter();
		writer.print("<ul>");
		
		for (Pet pet : pets) {
			writer.printf("<li>Nome pet:%s</li>", pet.getNome());
		}
		writer.print("</ul>");
	}

}
