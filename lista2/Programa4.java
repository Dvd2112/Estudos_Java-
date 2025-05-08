package lista2;

import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("Soma dos dois números: " + (num1 + num2));
        System.out.println("Subtração dos dois números: " + (num1 - num2));
        System.out.println("Divisão dos dois números: " + (num1 / num2));
        System.out.println("Multiplicação dos dois números: " + (num1 * num2));
        System.out.println("Resto da divisão dos dois números: " + (num1 % num2));

        scanner.close();
    }
}
