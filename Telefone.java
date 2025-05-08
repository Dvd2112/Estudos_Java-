public class Telefone {
    private char estado;
    private int ddd;
    private int numero;

    public void setEstado(char estadoinicial){
    estado = estadoinicial;
        
    }
    public void setnumero(int numNumero){
        numero = numNumero;
        
    }
    public void setDdd(int numDdd){
        ddd = numDdd;
        
    }
    public int getDdd (){
        return ddd;

    }
    public int getNumero (){
        return numero;

    }
    public int getEstado (){
        return estado;

    }
}

