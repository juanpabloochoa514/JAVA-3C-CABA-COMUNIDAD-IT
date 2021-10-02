package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("IMPRIMA UN NUMERO");
         int num1=scanner.nextInt();
         System.out.println("IMPRIMA OTRO NUMERO");
         int num2=scanner.nextInt();
         if(num1>num2){
             System.out.println("numero1 es mayor a numero 2");
         }else{
             System.out.println("numero 2 es mayor a numero 1");
         }
         if(num1==num2){
             System.out.println("son iguales");
         }
    }
   
    
}
