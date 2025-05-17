package aula_16_05_25;

public class Cliente {
    private String nome;
    private int idade;
    private double renda;
    private Endereco endereco;

    public Cliente() {}

    public Cliente(String nome, int idade, double renda) {
        setIdade(idade); // validação
        setRenda(renda); // validação
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 18) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Cliente deve ser maior de idade.");
        }
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        if (renda >= 2000.0) {
            this.renda = renda;
        } else {
            throw new IllegalArgumentException("Renda deve ser igual ou superior a 2000.00.");
        }
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
