package programacaocamadas.controller;

import programacaocamadas.model.Cliente;
import programacaocamadas.model.Emprestimo;
import programacaocamadas.view.ClienteView;

public class ClienteController {

    private Cliente cliente;
    private ClienteView view;

    public ClienteController(Cliente cliente, ClienteView view) {
        this.cliente = cliente;
        this.view = view;
    }

    public void adicionarEmprestimo() {
        double capital = view.readCapital();
        double taxa = view.readTaxa();
        int tempo = view.readTempo();
        boolean simples = view.readTipoEmprestimo();

        Emprestimo emprestimo = new Emprestimo(capital, taxa, tempo, simples);
        cliente.adicionarEmprestimo(emprestimo);
    }

    public void listarEmprestimos() {
        view.printCliente(cliente.getNome(), cliente.getCpf());
        int index = 0;
        for (Emprestimo e : cliente.getEmprestimos()) {
            view.printEmprestimo(index, e.calcularValorPagar(), e.getTipo());
            index++;
        }
    }

    public void quitarEmprestimo() {
        int index = view.readEmprestimoIndex();
        cliente.quitarEmprestimo(index);
    }
}
