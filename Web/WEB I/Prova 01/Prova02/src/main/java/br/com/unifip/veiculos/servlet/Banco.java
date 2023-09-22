package br.com.unifip.veiculos.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco{
	
	private static List<Veiculo> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	public void adicionarVeiculo(Veiculo veiculo) {
		veiculo.setId(chaveSequencial ++);
		lista.add(veiculo);	
	}
	
	public void removeVeiculo(Integer paramID) {
		Iterator<Veiculo> it  = lista.iterator();
		while(it.hasNext()) {
			Veiculo vei = it.next();
			if(vei.getId()==paramID) {
				it.remove();
			}
		}
	}
	
	public List<Veiculo> getVeiculos(){
		return Banco.lista;	
	}

	public Veiculo BuscaVeiculo(Integer id) {
		for (Veiculo veiculo : lista) {
			if(veiculo.getId() == id) {
				return veiculo;
			}
		}
		return null;
	}

	
}