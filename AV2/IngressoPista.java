package AV2;
//David Lopes Araujo Junior
public class IngressoPista extends Ingresso {
    private char pista;

    public IngressoPista(int codigo, Evento evento, char pista){
        super(codigo, evento);
        this.pista = pista;
    }

    public char getPista() {
        return pista;
    }

    public void setPista(char pista) {
        this.pista = pista;
    }

    public void calcularPrecoFinal() {

        valorBase = (getValorBase() * 1.10) + (getValorBase()*0.05);
    }

    
    public void imprimirIngresso() {
        System.out.println("INGRESSO..: " + evento.getNome());
        System.out.println("Código....: " + getCodigo());
        System.out.println("Data......: " + evento.getData());
        System.out.println("Vlr evento: " + evento.getValor() + " Bilheteria");
        System.out.println("Valor App.: " + (valorBase + (valorBase * 0.1)+((valorBase * 1.1) * 0.05)) + "(Taxa e adicionais)");
        System.out.println("Pista.....: " + pista);
        System.out.println("Taxa......: " + (valorBase * 0.1) + "(Taxa)");
        System.out.println("Adicional.: " + (valorBase * 0.05) + " (Pista reservada)");
        System.out.println(" ");
        
    }
}
