package br.com.unifip.veiculos.servlet;

public class Veiculo {
	
	private String nome;
	private String marca;
	private Integer id;
	public Veiculo(String nome, String marca) {
		super();
		this.nome = nome;
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}