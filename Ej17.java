package com.mycompany.unidad4practica3ej1;
import java.util.Scanner; 

public class Ej17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("INGRESE NUMERO PARA SABER SI ES PRIMO");
        double numero=scanner.nextDouble();
         
        if(numero%numero==0 && numero%1==0){
             System.out.println("ES PRIMO");
         }
         else{
             System.out.println("NO ES PRIMO");
         }
    }
}
