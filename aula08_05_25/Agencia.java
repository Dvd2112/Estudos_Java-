package aula08_05_25;

public class Agencia {
    private int numero;
    private String endereco;

    public Agencia(int numero, String endereco) {
        this.numero = numero;
        this.endereco = endereco;
    }

    public void setNumeroAgencia(int numero) {
        this.numero = numero;
    }

    public int getNumeroAgencia() {
        return numero;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}