package programacaocamadas.view;

import java.util.Scanner;

public class ClienteView {

    private Scanner scanner = new Scanner(System.in);

    public String readNome() {
        System.out.print("Nome do cliente: ");
        return scanner.nextLine();
    }

    public String readCpf() {
        System.out.print("CPF do cliente: ");
        return scanner.nextLine();
    }

    public double readCapital() {
        System.out.print("Valor do empréstimo: ");
        return scanner.nextDouble();
    }

    public double readTaxa() {
        System.out.print("Taxa de juros (% ao ano): ");
        return scanner.nextDouble();
    }

    public int readTempo() {
        System.out.print("Tempo (em anos): ");
        return scanner.nextInt();
    }

    public boolean readTipoEmprestimo() {
        System.out.print("Tipo de juros (1 - Simples | 2 - Composto): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        return tipo == 1;
    }

    public int readEmprestimoIndex() {
        System.out.print("Índice do empréstimo para quitar: ");
        return scanner.nextInt();
    }

    public void printCliente(String nome, String cpf) {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
    }

    public void printEmprestimo(int index, double valor, String tipo) {
        System.out.println("[" + index + "] Tipo: " + tipo + " | Valor a pagar: R$ " + valor);
    }
}
