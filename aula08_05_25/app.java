package aula08_05_25;

public class app {
    
    public static void main(String[] args) {
        int valor = 0;
        Agencia ag1 = new Agencia("dvd", 123);
        
        Agencia ag2 = new Agencia("dvd2", 456);
        Agencia ag3 = new Agencia("dvd3", 789);

        System.out.println(ag1.getNumero() +" "+ ag1.getNome());
        System.out.println(ag2.getNumero() +" "+ ag2.getNome());
        System.out.println(ag3.getNumero() +" "+ ag3.getNome());
        System.out.println( valor);
    }
}
