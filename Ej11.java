package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;
public class Ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL DINERO A DEPOSITAR");
        double deposito=scanner.nextDouble();
        double debita=0,importeresultante=0;
        debita=deposito*0.6;
        debita*=0.2;
        importeresultante=debita;
        System.out.println("el importe resultante es "+importeresultante);
    }
   
}
