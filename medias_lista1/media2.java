import java.util.Scanner;

public class media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de alunos: ");
        int totalAlunos = scanner.nextInt();

        int somaMedias = 0;
        int aprovados = 0;
        int exame = 0;
        int reprovadosNota = 0;

        //loop pra inserir as notas de todos os alunos
        for (int i = 1; i <= totalAlunos; i++) {
            System.out.print("Digite a média do aluno " + i + ": ");
            int media = scanner.nextInt();

            somaMedias += media;

            if (media >= 70) {
                aprovados++;
            } else if (media < 20) {
                reprovadosNota++;
            } else {
                exame++;
            }
        }
        //gera total das medias
        double mediaGeral = somaMedias / (double) totalAlunos;

        System.out.println("Média geral da turma: " + mediaGeral);
        System.out.println("Quantidade de alunos em exame: " + exame);
        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos reprovados por nota: " + reprovadosNota);

        scanner.close();
    }
}
