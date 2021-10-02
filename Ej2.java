package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NUMERO 1");
        int num1=scanner.nextInt();
        System.out.println("NUMERO 2");
        int num2=scanner.nextInt();
        System.out.println("NUMERO 3");
        int num3=scanner.nextInt();
        if(num1<num2){
            if(num2<num3){
                System.out.println("ESTAN ORDENADO DE FORMA CRECIENTE");
            }
        }else{
            System.out.println("no estan ordenado de forma creciente");
        }
        
    }
}
