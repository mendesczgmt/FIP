import java.util.ArrayList;
import java.util.List;

class CadastroClientes {
    private List<Cliente> clientes;

    public CadastroClientes() {
        clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }
}