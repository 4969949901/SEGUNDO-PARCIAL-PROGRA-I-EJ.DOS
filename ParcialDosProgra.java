
package parcialdosprogra;

import java.util.Scanner;

public class ParcialDosProgra {

 
    public static void main(String[] args) {
        TarjetasBancariasPd padre = new TarjetasBancariasPd();
        TarjetaCreditoHj hija1= new TarjetaCreditoHj();
        TarjetaDebitoHj hija2= new TarjetaDebitoHj();
           
        
        System.out.println("USO DE TARJETAS DE CREDITO/DEBITO\n");
        System.out.println("A continuacion seleccione la tarjeta bancaria que utilizara");
        System.out.println("1.Tarjeta de Credito");
        System.out.println("2.Tarjeta de Debito");
        System.out.println("3.Salir");
        Scanner teclado= new Scanner (System.in);
        int opc;
        System.out.println("Introduzca el numero de opcion por favor");
        opc=teclado.nextInt();  
        switch(opc ){
            
            case 1:
                System.out.print("Ha seleccionado la opcion 1: Tarjeta de Credito");
                TarjetasBancariasPd limite= new TarjetasBancariasPd();
                System.out.println("SE LE INDICA QUE EL LIMITE DE SU TARJETA DE CREDITO ES DE: "+limite.getlimiteCredito()+"\n");
                TarjetasBancariasPd nombre=new TarjetasBancariasPd();
                System.out.println("EL NOMBRE DEL TITULAR DE LA TARJETA ES"+nombre.getnombreTarjeta()+"\n");
                TarjetaCreditoHj inte= new TarjetaCreditoHj();
                System.out.println("El INTERES SOBRE SU TARJETA ES DE: ");
                TarjetasBancariasPd numero=new TarjetasBancariasPd();
                System.out.println("EL NOMBRE DEL NUMERO DE LA TARJETA ES"+ numero.getnombreTarjeta()+"\n");
                TarjetasBancariasPd saldo=new TarjetasBancariasPd();
                System.out.println("SU SALDO ACTUAL ES DE: "+ saldo.metodoSaldoCredito(opc, opc)+"\n");
                TarjetasBancariasPd compra=new TarjetasBancariasPd();
                System.out.println("Desea Comprar algo "+"\n");
                Scanner comprade= new Scanner(System.in);
                int cc;
                System.out.println("Introduzca el monto de lo que desea comprar");
                cc=comprade.nextInt();
                 TarjetaCreditoHj pagars=new TarjetaCreditoHj();
                System.out.println("FORMA DE PAGO "+ pagars.metodoPagar+"\n");
                
                
                     
        
                
        }
        
     
}
    
    
    
    
}
