package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repositories.PetRepository;

@WebServlet("/DeletaPet")
public class DeletaPet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	PetRepository repository = new PetRepository();

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO: deleta da lista o item que tiver o id que veio por query param
		
		boolean deletado = repository.deleta(1);
		
		PrintWriter writer = response.getWriter();
		writer.print(deletado);
		response.setStatus(204);
	}

}
