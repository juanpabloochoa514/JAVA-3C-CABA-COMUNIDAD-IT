package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;
public class Ej14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int contadorespares=0,contadoresimpares=0;
        int i=0;
        System.out.println("INGRESE NUMERO");
        i=scanner.nextInt();
        while(i!=0){
            
            if(i%2==0){
                
                System.out.println("es par : "+i);
                contadorespares+=i;
                
            }
            if(i%2!=0){
                System.out.println("es impar"+i);
                contadoresimpares+=i;
                
            }
            System.out.println("INGRESE UN NUMERO , O PARA FINALIZAR");
            i=scanner.nextInt();
            System.out.println("CANTIDAD DE NUMEROS PARES "+contadorespares);
            System.out.println("CANTIDAD DE NUMEROS IMPARES"+contadoresimpares);
        }
            
        
    }
    }
        
