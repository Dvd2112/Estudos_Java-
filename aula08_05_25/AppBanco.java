package aula08_05_25;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Agencia> agencias = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Conta> contas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n==== MENU BANCO ====");
            System.out.println("1. Cadastrar Agência");
            System.out.println("2. Cadastrar Cliente e Conta");
            System.out.println("3. Ver Cadastros");
            System.out.println("4. Depositar");
            System.out.println("5. Sacar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Número da agência: ");
                    String numAg = scanner.nextLine();
                    System.out.print("Endereço da agência: ");
                    String endAg = scanner.nextLine();
                    agencias.add(new Agencia(numAg, endAg));
                    System.out.println("Agência cadastrada com sucesso!");
                    break;

                case 2:
                    if (agencias.isEmpty()) {
                        System.out.println("Cadastre uma agência antes!");
                        break;
                    }

                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF do cliente: ");
                    String cpf = scanner.nextLine();

                    Cliente cliente = new Cliente(nome, cpf);
                    clientes.add(cliente);

                    System.out.print("Número da conta: ");
                    int numConta = scanner.nextInt();
                    System.out.print("Saldo inicial: ");
                    double saldo = scanner.nextDouble();
                    System.out.print("Limite: ");
                    double limite = scanner.nextDouble();
                    scanner.nextLine(); // limpar buffer

                    System.out.println("Agências disponíveis:");
                    for (int i = 0; i < agencias.size(); i++) {
                        System.out.println((i+1) + ". " + agencias.get(i).getNumero());
                    }
                    System.out.print("Escolha o número da agência para vincular a conta: ");
                    int indiceAgencia = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (indiceAgencia >= 0 && indiceAgencia < agencias.size()) {
                        Conta conta = new Conta(numConta, saldo, limite);
                        conta.setAgencia(agencias.get(indiceAgencia));
                        conta.setCliente(cliente);
                        contas.add(conta);
                        System.out.println("Cliente e Conta cadastrados com sucesso!");
                    } else {
                        System.out.println("Agência inválida.");
                    }
                    break;

                case 3:
                    System.out.println("\n=== Agências ===");
                    for (Agencia ag : agencias) {
                        System.out.println("Número: " + ag.getNumero() + ", Endereço: " + ag.getEndereco());
                    }

                    System.out.println("\n=== Clientes e Contas ===");
                    for (Conta c : contas) {
                        System.out.println("Cliente: " + c.getCliente().getNome() + " (CPF: " + c.getCliente().getCpf() + ")");
                        System.out.println("Conta: " + c.getNumero() + ", Saldo: " + c.getSaldo() + ", Limite: " + c.getLimite());
                        System.out.println("Agência: " + c.getAgencia().getNumero());
                        System.out.println("-------------------------");
                    }
                    break;

                case 4: // Depositar
                    System.out.print("Digite o número da agência: ");
                    String agDeposito = scanner.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfDeposito = scanner.nextLine();

                    Conta contaDeposito = buscarConta(contas, agDeposito, cpfDeposito);
                    if (contaDeposito != null) {
                        System.out.print("Valor para depositar: ");
                        double valor = scanner.nextDouble();
                        contaDeposito.depositar(valor);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    scanner.nextLine(); // limpar buffer
                    break;

                case 5: // Sacar
                    System.out.print("Digite o número da agência: ");
                    String agSaque = scanner.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfSaque = scanner.nextLine();

                    Conta contaSaque = buscarConta(contas, agSaque, cpfSaque);
                    if (contaSaque != null) {
                        System.out.print("Valor para sacar: ");
                        double valor = scanner.nextDouble();
                        contaSaque.sacar(valor);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    scanner.nextLine(); // limpar buffer
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static Conta buscarConta(ArrayList<Conta> contas, String agenciaNumero, String cpf) {
        for (Conta c : contas) {
            if (c.getAgencia().getNumero().equals(agenciaNumero) && c.getCliente().getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }
}
