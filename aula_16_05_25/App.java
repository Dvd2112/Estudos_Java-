package aula_16_05_25;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente[] clientes = new Cliente[2];

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Cadastro do Cliente " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Renda: ");
            double renda = Double.parseDouble(scanner.nextLine());

            Cliente cliente = new Cliente(nome, idade, renda);

            System.out.println("Endereço do Cliente " + (i + 1));
            System.out.print("Logradouro: ");
            String logradouro = scanner.nextLine();

            System.out.print("Número: ");
            int numero = Integer.parseInt(scanner.nextLine());

            System.out.print("Complemento: ");
            String complemento = scanner.nextLine();

            System.out.print("CEP: ");
            String cep = scanner.nextLine();

            System.out.print("Bairro: ");
            String bairroNome = scanner.nextLine();
            Bairro bairro = new Bairro(bairroNome);

            System.out.print("Cidade: ");
            String cidadeNome = scanner.nextLine();

            System.out.print("Estado: ");
            String estadoNome = scanner.nextLine();
            Estado estado = new Estado(estadoNome);

            Cidade cidade = new Cidade(cidadeNome, estado);

            Endereco endereco = new Endereco(logradouro, numero, complemento, cep, cidade, bairro);
            cliente.setEndereco(endereco);

            clientes[i] = cliente;
        }

        System.out.println("\n=== DADOS DOS CLIENTES ===");
        for (Cliente cliente : clientes) {
            Endereco e = cliente.getEndereco();
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Renda: R$ " + cliente.getRenda());
            System.out.println("Endereço: " + e.getLogradouro() + ", " + e.getNumero() + ", " + e.getComplemento());
            System.out.println("Bairro: " + e.getBairro().getNome());
            System.out.println("Cidade: " + e.getCidade().getNome());
            System.out.println("Estado: " + e.getCidade().getEstado().getNome());
            System.out.println("CEP: " + e.getCep());
            System.out.println("--------------------------");
        }

        scanner.close();
    }
}

