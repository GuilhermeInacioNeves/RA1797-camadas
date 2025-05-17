package programacaocamadas;

import programacaocamadas.controller.ClienteController;
import programacaocamadas.model.Cliente;
import programacaocamadas.view.ClienteView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ClienteView view = new ClienteView();
        String nome = view.readNome();
        String cpf = view.readCpf();

        Cliente cliente = new Cliente(nome, cpf);
        ClienteController controller = new ClienteController(cliente, view);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar Empréstimo");
            System.out.println("2 - Listar Empréstimos");
            System.out.println("3 - Quitar Empréstimo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    controller.adicionarEmprestimo();
                    break;
                case 2:
                    controller.listarEmprestimos();
                    break;
                case 3:
                    controller.quitarEmprestimo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
