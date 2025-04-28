import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    static Random random = new Random();
    static int numeroSecreto = random.nextInt(100) + 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tente adivinhar o número entre 1 e 100:");
        jogar(scanner);
        scanner.close();
    }

    public static void jogar(Scanner scanner) {
        System.out.print("Seu palpite: ");
        int palpite = scanner.nextInt();

        if (palpite == numeroSecreto) {
            System.out.println("Parabéns! Você acertou!");
        } else if (palpite < numeroSecreto) {
            System.out.println("Tente um número maior!");
            jogar(scanner);
        } else {
            System.out.println("Tente um número menor!");
            jogar(scanner);
        }
    }
}
