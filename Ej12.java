package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE NUMERO");
        int numero=scanner.nextInt();
        while(numero!=-1){
            
            if(numero==10){
                System.out.println("INGRESASTE 5+5");
            }
            if(numero==35){
                System.out.println("INGRESASTE 35");
            }
            System.out.println("INGRESE NUMERO");
            numero=scanner.nextInt();
        }
    }
}
