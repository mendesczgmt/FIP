package br.com.unifip.veiculos.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastrarVeiculo")
public class CadastrarVeiculoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeVeiculo = request.getParameter("nome");
		String marcaVeiculo = request.getParameter("marca");
		
		Veiculo veiculo = new Veiculo(nomeVeiculo, marcaVeiculo);
		veiculo.setNome(nomeVeiculo);
		veiculo.setMarca(marcaVeiculo);
		Banco banco = new Banco();
		
		banco.adicionarVeiculo(veiculo);
		
		System.out.println("Novo veiculo cadastrado");
		response.sendRedirect("listaVeiculos");
	}

}
