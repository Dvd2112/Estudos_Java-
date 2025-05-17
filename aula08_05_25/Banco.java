package aula08_05_25;

public class Banco {
    private String nome;
    private int numero;

    public Banco(){

    }

    public Banco(int numero){
        this.numero = numero;
    }

    public void setNumeroBanco(int numero1) {
        this.numero = numero1;
    }

    public int getNumeroBanco() {
        return numero;
    }

    
}
