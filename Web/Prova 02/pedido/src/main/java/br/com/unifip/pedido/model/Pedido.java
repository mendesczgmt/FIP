package br.com.unifip.pedido.model;

public class Pedido {
    private Integer id;
    private String descricao;
    private Integer valor;
    private String status;

    public Pedido(DadosCadastroPedido dados, String status, Integer id) {
        this.descricao = dados.descricao();
        this.valor = dados.valor();
        this.status = status;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
}
