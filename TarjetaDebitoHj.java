
package parcialdosprogra;


public class TarjetaDebitoHj extends TarjetasBancariasPd {
    
    public int metodoDepositar(int depositar, int saldoActual){
    
        int deposito;
        deposito=saldoActual+depositar;
        return deposito;
    }
    
    
   
    
    
}
