
package parcialdosprogra;


public class TarjetasBancariasPd {
    //atributos
    private int limiteCredito;
    private int limiteDebito;
    private  String nombreTarjeta;
    private int numeroTarjeta;
    private double saldoActual;
    private double comprar;
    
    //contructores
    public TarjetasBancariasPd (){
        this.limiteCredito=10000;
        this.limiteDebito=5000;
        this.nombreTarjeta="HELEN ACEVEDO";
    }
    //metodo de clase padre
 
    public int getLimiteCredito() {
        return limiteCredito;                        //getter and setter para el limitecredito
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
     public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }
}
