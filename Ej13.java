
package com.mycompany.unidad4practica3ej1;


public class Ej13 {
    public static void main(String[] args) {
        int contadorespares=0,contadoresimpares=0;
        int suma1=0,suma2=0;
        
        
        int i=1;
        while(contadorespares!=10 ){
            
            if(i%2==0){
                
                System.out.println("NUMERO PARES   "+i);
                contadorespares++;
                suma1+=i;
            }
           
            
            i++;
            
            
        }
        System.out.println("SUMA DE PARES  "+suma1);
        int o=0;
        while(contadoresimpares!=10){
           if(o%2!=0){
               System.out.println("NUMEROS IMPARES   "+o);
               contadoresimpares++;
           } 
           o++;
        }
        
        
            
        
    }
}
