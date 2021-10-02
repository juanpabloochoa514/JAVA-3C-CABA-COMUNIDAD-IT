
package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;
public class Ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL DINERO A DEPOSITAR");
        double deposito=scanner.nextDouble();
        double netodepositado=0,sumadecredito=0;
        while(deposito>=1000){
            sumadecredito=deposito * 0.6;
            deposito-=sumadecredito;
            
        }
        netodepositado-=deposito;
        System.out.println("el total acreditado es "+netodepositado);
    }
    
}
