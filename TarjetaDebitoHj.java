
package parcialdosprogra;


public class TarjetaDebitoHj extends TarjetasBancariasPd {
    
   int deposito;
   
   public int metodoDeposito (int saldoActual,int deposito){
         int saldoDebito;
         saldoDebito = deposito+saldoActual;
         
         return saldoDebito;
   
   }
    
    
    
}
