import java.util.Scanner;

public class TorreDeHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de discos: ");
        int n = scanner.nextInt();
        moverDiscos(n, 'A', 'C', 'B');
        scanner.close();
    }

    public static void moverDiscos(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return;
        }
        moverDiscos(n - 1, origem, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        moverDiscos(n - 1, auxiliar, destino, origem);
    }
}
