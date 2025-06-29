package AV2;
//David Lopes Araujo Junior
public class Ingresso extends Evento{
    private int codigo;
    protected Evento evento;
    protected double valorBase;

    public Ingresso(int codigo, Evento evento){
        super(evento.getNome(), evento.getNome(), evento.getValor());
        this.codigo = codigo;
        this.valorBase = getValor();
        this.evento = evento;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public double getValorBase() {
        return valorBase;
    }

    public void calcularPrecoFinal() {
        valorBase = getValorBase() * 1.10;
    }

    public void imprimirIngresso() {
        
        System.out.println("INGRESSO..: " + evento.getNome());
        System.out.println("Código....: " + codigo);
        System.out.println("Data......: " + evento.getData());
        System.out.println("Vlr evento: " + evento.getValor() + " Bilheteria");
        System.out.println("Valor App.: " + (valorBase * 1.10) + "(Taxa e adicionais)");
        System.out.println(" ");
    }
    

}
