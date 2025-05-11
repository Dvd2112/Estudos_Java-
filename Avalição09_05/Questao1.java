package Avalição09_05;
import java.util.Scanner;
public class Questao1 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

            System.out.println("-------------------");
            System.out.println("OPÇÕES DO CAIXA");
            System.out.println("-------------------");
            System.out.println("[1] Saque");
            System.out.println("[2] Depósito");
            System.out.println("[3] Saldo");
            System.out.println("[4] Pix");
            System.out.println("[5] Finalizar");
            System.out.print("Informe uma opção: ");
            opcao = scanner.nextInt();

            if(opcao >= 1 && opcao <5){
            System.out.print("Opção: "+opcao);
            }else if(opcao == 5){
                System.out.print("Atendimento Finalizado");
            }else{
                System.out.print("Opção invalida");
            }

    }
}
