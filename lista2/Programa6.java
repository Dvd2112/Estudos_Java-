package lista2;

import java.util.Scanner;

public class Programa6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Trocando valores
        int temp = valor1;
        valor1 = valor2;
        valor2 = temp;

        System.out.println("Valor1 agora é: " + valor1);
        System.out.println("Valor2 agora é: " + valor2);

        scanner.close();
    }
}
