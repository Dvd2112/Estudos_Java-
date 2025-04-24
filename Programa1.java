import java.util.Scanner;
public class Programa1{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String nome = "fulano";
        double salario = 1023.27;
        boolean ativo = true;
        char sexo = 'm';
        System.out.println(nome);
        System.out.println(salario);
        System.out.println(ativo);
        System.out.println(sexo);
        System.out.println("informe sua idade");
        int idade = scanner.nextInt();

        System.out.println("sua idade"+ idade);
    }
}