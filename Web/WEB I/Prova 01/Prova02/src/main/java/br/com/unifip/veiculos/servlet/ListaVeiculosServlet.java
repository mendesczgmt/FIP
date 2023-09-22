package br.com.unifip.veiculos.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaVeiculos")
public class ListaVeiculosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Veiculo> lista = banco.getVeiculos();
		request.setAttribute("veiculos", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaVeiculos.jsp");
		rd.forward(request, response);
	}

}

