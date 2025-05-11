package aula08_05_25;

public class Agencia {
    private String numero;
    private String endereco;

    public Agencia(String numero, String endereco) {
        this.numero = numero;
        this.endereco = endereco;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}