package AV2;

public class AppVendaIngresso {
    
  public static void main(String[] args) {
    Evento evento1 = new Evento("CA Fest I", "12/07/2025", 50);
    Evento evento2 = new Evento("CA Fest II", "02/08/2025", 40);
    Evento evento3 = new Evento("CA Fest III", "13/12/2025", 100);
    
    Ingresso ing   = new Ingresso(1, evento1);
    ing.imprimirIngresso();

    IngressoPista ingPista = new IngressoPista(2, evento1, 'A');
    ingPista.imprimirIngresso();

    IngressoVip ingVip = new IngressoVip(3, evento1);
    ingVip.imprimirIngresso();
  }
}


