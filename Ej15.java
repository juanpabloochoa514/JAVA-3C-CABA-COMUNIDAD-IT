package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("INGRESE NUMERO ENTERO -1 para cerrar");
        int i=scanner.nextInt();
        int SUMA=0;
        while(i!=-1){
            SUMA+=i;
            System.out.println("INGRESE NUMERO ENTERO -1 para cerrar");
            i=scanner.nextInt();
            
        }
        System.out.println("LA SUMA TOTAL DE NUMEROS ENTEROS ES "+SUMA);
    }
}
