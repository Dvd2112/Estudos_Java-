package lista2;

import java.util.Scanner;

public class Programa7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto (0 a 100): ");
        double percentualDesconto = scanner.nextDouble();

        System.out.print("Digite o valor da taxa de entrega: ");
        double taxaEntrega = scanner.nextDouble();

        double valorDesconto = valorProduto * (percentualDesconto / 100);
        double valorComDesconto = valorProduto - valorDesconto;
        double valorFinal = valorComDesconto + taxaEntrega;

        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor do produto: " + valorProduto);
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Valor do produto com desconto: " + valorComDesconto);
        System.out.println("Valor da taxa de entrega: " + taxaEntrega);
        System.out.println("Valor final do produto (com desconto e taxa de entrega): " + valorFinal);

        scanner.close();
    }
}
