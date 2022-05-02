
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
        System.out.println("Introduzca el numero de opción por favor");
        opc=teclado.nextInt();  
        switch(opc ){
            
            case 1:
                System.out.print("Ha seleccionado la opcion 1: Tarjeta de Credito");
                System.out.println("SE LE INDICA QUE EL LIMITE DE SU TARJETA DE CREDITO ES DE: ");
              
        
                
        }
        
        
}
    
    
    
    
}
