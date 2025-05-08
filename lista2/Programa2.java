package lista2;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        double resultado = valor1 * valor2;

        System.out.println("Resultado da multiplicação: " + resultado + ".");

        scanner.close();
    }
}
