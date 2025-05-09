package Diferentes;
import java.util.Scanner;
public class Notas {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    int nota1B1, nota2B1, nota1B2, nota2B2;
    double media1, media2, mediafim;

    System.out.println("Informe a nota 1 do primeiro bimestre");
    nota1B1 = scanner.nextInt();
    System.out.println("Informe a nota 2 do primeiro bimestre");
    nota2B1 = scanner.nextInt();
    System.out.println("A média do primeiro bimestre é");
    System.out.println("Informe a nota 1 do segundo bimestre");
    nota1B2 = scanner.nextInt();
    System.out.println("Informe a nota 2 do segundo bimestre");
    nota2B2 = scanner.nextInt();
    
    media1 = (nota1B1 + nota2B1)/2; 
    media2 = (nota1B2 + nota2B2)/2;
    mediafim= (media1 + media2)/2;
    System.out.println("A média do primeiro bimestre é "+ media1);
    System.out.println("A média do segundo bimestre é "+ media2);
    System.out.println("A média final é "+ media2);
    if (mediafim < 70 && mediafim > 20)
        System.out.println("Ficou de Exame");
     else if(mediafim < 20)
        System.out.println("Reprovado");
    else
        System.out.println("aprovado");
    
    }
    
}
