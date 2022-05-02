
package parcialdosprogra;


public class TarjetasBancariasPd {
    //atributos
    private int limiteCredito;
    private int limiteDebito;
    private  String nombreTarjeta;
    private int numeroTarjeta;
    private double comprar;
    
    //contructores
    public TarjetasBancariasPd (){
        this.limiteCredito=10000;
        this.limiteDebito=5000;
        this.nombreTarjeta="HELEN ACEVEDO";
    }
    //metodo de clase padre

    public int getLimiteDebito() {
        return limiteDebito;
    }

    public void setLimiteDebito(int limiteDebito) {
        this.limiteDebito = limiteDebito;
    }
 
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
    
    public double metodoSaldoCredito (int limite,double saldo){
        int saldoActual;
        
        saldoActual= (int) (limiteCredito-comprar);
        return saldoActual;
        
    }
    public double metodoSaldoDebito(int limite2,double saldo2){
        int saldoActual;
        
        saldoActual= (int) (limiteDebito-comprar);
        return saldoActual;
    
    }
    
}
