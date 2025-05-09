package aula08_05_25;

public class Agencia {
    private int numero;
    private String nome;

    public String getNome(){
        return this.nome;
    }
    public int getNumero(){
        return this.numero;
    }
    public Agencia(){
        numero = 0 ;
        nome = "-";
    }

    public Agencia(String nome){
        this.nome = nome;
    }

    public Agencia(int numero /*variavel local */){
        this.numero = numero;
    }

    public Agencia(String nome, int numero){
        this.numero = numero;
        this.nome = nome;

    }
}
