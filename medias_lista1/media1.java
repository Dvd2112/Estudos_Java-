import java.util.Scanner;

public class media1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // le as 4 notas
        System.out.print("Digite a nota da prova do 1º bimestre: ");
        int prova1 = scanner.nextInt();

        System.out.print("Digite a nota do trabalho do 1º bimestre: ");
        int trabalho1 = scanner.nextInt();

        System.out.print("Digite a nota da prova do 2º bimestre: ");
        int prova2 = scanner.nextInt();

        System.out.print("Digite a nota do trabalho do 2º bimestre: ");
        int trabalho2 = scanner.nextInt();

        // calcula media
        double media = (prova1 + trabalho1 + prova2 + trabalho2) / 4.0;
        System.out.println("Média do aluno: " + media);

        // verifica a situacao
        if (media >= 70) {
            System.out.println("Aprovado");
        } else if (media < 20) {
            System.out.println("Reprovado por nota");
        } else {
            System.out.println("Exame");
        }

        scanner.close();
    }
}
