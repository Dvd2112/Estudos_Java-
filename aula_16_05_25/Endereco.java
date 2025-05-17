package aula_16_05_25;

public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private Cidade cidade;
    private Bairro bairro;

    public Endereco() {}

    public Endereco(String logradouro, int numero, String complemento, String cep, Cidade cidade, Bairro bairro) {
        setNumero(numero); // validação
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero >= 0 && numero <= 10000) {
            this.numero = numero;
        } else {
            throw new IllegalArgumentException("Número do endereço deve estar entre 0 e 10000.");
        }
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
}

