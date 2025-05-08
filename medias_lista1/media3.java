import java.util.Scanner;

public class media3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de alunos: ");
        int totalAlunos = scanner.nextInt();

        int somaMedias = 0;
        int aprovados = 0;
        int exame = 0;
        int reprovadosNota = 0;
        int reprovadosFalta = 0;

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.print("Digite a média do aluno " + i + ": ");
            int media = scanner.nextInt();

            System.out.print("Digite o total de faltas do aluno " + i + ": ");
            int faltas = scanner.nextInt();

            somaMedias += media;

            if (faltas > 20) {
                reprovadosFalta++;
            } else if (media >= 70) {
                aprovados++;
            } else if (media < 20) {
                reprovadosNota++;
            } else {
                exame++;
            }
        }

        double mediaGeral = somaMedias / (double) totalAlunos;

        System.out.println("Média geral da turma: " + mediaGeral);
        System.out.println("Quantidade de alunos em exame: " + exame);
        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos reprovados por nota: " + reprovadosNota);
        System.out.println("Quantidade de alunos reprovados por falta: " + reprovadosFalta);

        scanner.close();
    }
}
