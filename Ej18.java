package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1,num2,mcm,i;
        System.out.println("Ingrese primer numero:");
        num1=scanner.nextInt();
        System.out.println("Ingrese segundo numero:");
        num2=scanner.nextInt();
        mcm=1;
        i=2;
        while(i <= num1 || i <= num2)
        {
            if(num1%i==0 || num2%i==0)
            {
            mcm=mcm*i;
            if(num1%i==0) num1=num1/i;
            if(num2%i==0) num2=num2/i;
            }
            else
                i=i+1;               
        }                        
        System.out.println("El MCM es =" +mcm);                                          
        }  
    }
           

