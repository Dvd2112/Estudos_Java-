package Avalição09_05;
import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double saldo = 0, deposito = 0;
        do{
            
            System.out.println("\n-------------------");
            System.out.println("OPÇÕES DO CAIXA");
            System.out.println("-------------------");
            System.out.println("[1] Saque");
            System.out.println("[2] Depósito");
            System.out.println("[3] Saldo");
            System.out.println("[4] Pix");
            System.out.println("[5] Finalizar");
            System.out.print("Informe uma opção: ");
            opcao = scanner.nextInt();
            deposito += deposito - deposito;
            if(opcao == 1){
            System.out.print("Opção: "+opcao);
            }
            else if(opcao == 2){
                System.out.print("Valor do Depósito ");
                deposito = scanner.nextDouble();
                
                if(deposito < 1 || deposito > 1000){
                    System.out.print("Valor do deposito é invalido");
                }else{
                    saldo += deposito;
                }
            }else if(opcao == 3){
                System.out.print("Saldo: " + saldo);
            }else if(opcao == 4){
                System.out.print("Opção :"+ opcao);
            }else if(opcao == 5){
                System.out.print("Atendimento Finalizado");
            }else{
                System.out.print("Opção invalida");
            }
        } while(opcao != 5);
    

    }
}