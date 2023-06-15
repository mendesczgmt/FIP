package br.com.unifip.pedido.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifip.pedido.model.DadosCadastroPedido;
import br.com.unifip.pedido.model.Pedido;

@RestController
@RequestMapping("/pedidos")

public class PedidosController {
    private static List<Pedido> lista = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    @PostMapping
    public String cadastrarPedidos(@RequestBody DadosCadastroPedido dados) {
        Integer id = chaveSequencial++;
        String status = "pendente";
        Pedido pedido = new Pedido(dados, status, id);
        lista.add(pedido);
        System.out.println("Pedido cadastrado com sucesso");
        return "Pedido cadastrado com sucesso";
    }

    @GetMapping
    public List<Pedido> listar() {
        return lista;
    }

    @GetMapping("/{id}")
    public Pedido buscarPedido(@PathVariable int id) {
        for (Pedido pedido : lista) {
            if (pedido.getId() == id) {
                return pedido;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deletarPedido(@PathVariable int id) {
        for (Pedido pedido : lista) {
            if (pedido.getId() == id) {
                pedido.setStatus("excluido");
            }
        }
        return "Pedido excluido com sucesso";
    }

    @PutMapping("/{id}/efetiva")
    public Pedido efetivaPedido(@PathVariable int id) {
        for (Pedido pedido : lista) {
            if (pedido.getId() == id) {
                pedido.setStatus("EFETIVADO");
                return pedido;
            }
        }
        return null;
    }

    @PutMapping("/{id}/cancela")
    public Pedido cancelaPedido(@PathVariable int id) {
        for (Pedido pedido : lista) {
            if (pedido.getId() == id) {
                pedido.setStatus("CANCELADO");
                return pedido;
            }
        }
        return null;
    }
}
