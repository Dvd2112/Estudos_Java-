package lista2;

import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número inteiro maior que zero: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Valor inválido. Digite um valor maior que zero.");
            }
        } while (numero <= 0);

        System.out.println("Antecessor: " + (numero - 1));
        System.out.println("Sucessor: " + (numero + 1));

        scanner.close();
    }
}
