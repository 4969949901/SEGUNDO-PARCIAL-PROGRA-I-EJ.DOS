
package parcialdosprogra;


public class TarjetasBancariasPd {
    //atributos
    private int limiteCredito;
    private int limiteDebito;
    private  String nombreTarjeta;
    private int numeroTarjeta;
    private double comprar;
    
    //contructores
    public TarjetasBancariasPd (int limiteCredito, int limiteDebito,String nombreTarjeta,int numeroTarjeta,double comprar){
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
    
    
    TarjetasBancariasPd(int limiteCredito){
        this.limiteCredito=10000;
    }

    public int getlimiteCredito() {
        return this.limiteCredito;
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
