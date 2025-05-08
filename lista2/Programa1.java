package lista2;

import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Meu nome é " + nome + " e posso ser contatado no e-mail " + email + " ou pelo telefone " + telefone + ".");

        scanner.close();
    }
}