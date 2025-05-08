package lista2;

import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("Média aritmética dos dois números: " + ((num1 + num2) / 2.0));

        scanner.close();
    }
}

