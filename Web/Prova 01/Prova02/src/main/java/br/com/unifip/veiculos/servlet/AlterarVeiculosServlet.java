package br.com.unifip.veiculos.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alterarVeiculos")
public class AlterarVeiculosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramID = request.getParameter("id");
		Integer id = Integer.valueOf(paramID);
		String nomeVeiculo = request.getParameter("nome");
		String marcaVeiculo = request.getParameter("marca");
		
		Banco banco = new Banco();
		Veiculo veiculo = banco.BuscaVeiculo(id);
		veiculo.setNome(nomeVeiculo);
		veiculo.setMarca(marcaVeiculo);
		
		response.sendRedirect("listaVeiculos");
	}

}
