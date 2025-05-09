import java.util.Scanner;

public class VerificadorPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        if (ehPalindromo(texto, 0, texto.length() - 1)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
        scanner.close();
    }

    public static boolean ehPalindromo(String texto, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (texto.charAt(inicio) != texto.charAt(fim)) {
            return false;
        }
        return ehPalindromo(texto, inicio + 1, fim - 1);
    }
}
