package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;
public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL DINERO A DEPOSITAR");
        double deposito=scanner.nextDouble();
        double comision=0,netodepositado=0;
        if(deposito>2000){
            comision=(deposito*2)/100;
        }
        netodepositado=deposito-comision;
        System.out.println("deposito total mas comision"+netodepositado);
        
    }
}
