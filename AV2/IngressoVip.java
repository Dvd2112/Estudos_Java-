package AV2;
//David Lopes Araujo Junior
public class IngressoVip extends Ingresso{
    private double valorAdicional;
    private String beneficios;
    
    public IngressoVip(int codigo, Evento evento){
        super(codigo, evento);
        this.valorAdicional = valorBase * 0.5;
        this.beneficios = "Acesso area vip";
    }

    public void calcularPrecoFinal() {
        valorBase = valorAdicional + (getValorBase() * 1.1);
    }
    
    public void imprimirIngresso() {
        System.out.println("INGRESSO..: " + evento.getNome());
        System.out.println("Código....: " + getCodigo());
        System.out.println("Data......: " + evento.getData());
        System.out.println("Vlr evento: " + evento.getValor() + " Bilheteria");
        System.out.println("Valor App.: " + (valorBase + (valorBase /2))+ "(Taxa e adicionais)");
        System.out.println("Benefícios: " + beneficios);
        System.out.println("Taxa......: " + (valorBase - evento.getValor()) + "(Taxa)");
        System.out.println("Valor Vip.: " + (evento.getValor() / 2) + " (acesso area vip)");
        System.out.println(" ");
        
    }
}