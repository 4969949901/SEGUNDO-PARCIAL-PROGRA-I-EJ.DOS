
package parcialdosprogra;


public class TarjetaCreditoHj extends TarjetasBancariasPd {
    private int tasaInteres= 4;
    
    
    //constructor
    public TarjetaCreditoHj(int tasaInteres){
        this.tasaInteres=tasaInteres;
    }
      //setter y getter
    public int getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(int tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
   
    
    public int metodoPagar(int paga,int saldoActual){
         int pagar;
         pagar= saldoActual+paga;
             
    
        return pagar;
        
             
        
    
    }
    
    
}
