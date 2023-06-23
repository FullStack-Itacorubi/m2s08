package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Pet;
import repositories.PetRepository;

@WebServlet("/CadastroPet")
public class CadastroPet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PetRepository repository = new PetRepository();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Pet novoPet = new Pet();
		
		novoPet.setNome(request.getParameter("nome"));
		novoPet.setEspecie(request.getParameter("especie"));
		novoPet.setPeso(Double.parseDouble(request.getParameter("peso")));
		
		repository.cadastra(novoPet);
		
		PrintWriter writer = response.getWriter();
		writer.printf("<h1>Nome do pet cadastrado: %s</h1>", novoPet.getNome());
	}
}
