
package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("INGRESE AÑO");
         int anio= scanner.nextInt();
         System.out.println("INGRESE MES");
         int mes=scanner.nextInt();
         if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            System.out.println("El año es bisiesto");
             switch(mes){
                 case 1:
                 case 3:
                 case 5:
                 case 7:
                 case 8:
                 case 10:
                 case 12:
                     System.out.println("31dias");
                     break;
                 case 2:
                     System.out.println("28 dias");
                     break;
                 case 4: 
                 case 6:
                 case 9:
                 case 11:
                     System.out.println("30 dias");
                     break;
         }
         }
	
         else{
              System.out.println("El año no es bisiesto"); 
              switch(mes){
                 case 1:
                 case 3:
                 case 5:
                 case 7:
                 case 8:
                 case 10:
                 case 12:
                     System.out.println("31dias");
                     break;
                 case 2:
                     System.out.println("28 dias");
                     break;
                 case 4: 
                 case 6:
                 case 9:
                 case 11:
                     System.out.println("30 dias");
                     break;
             
         }
             
            
         }
         }
	
    }
 