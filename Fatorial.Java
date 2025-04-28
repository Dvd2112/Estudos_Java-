import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = scanner.nextInt();
        System.out.println(num + "! = " + fatorial(num));
        scanner.close();
    }

    public static long fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
