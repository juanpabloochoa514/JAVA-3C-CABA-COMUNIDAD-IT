package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PESO 1 CAMION");
        int peso1=scanner.nextInt();
        System.out.println("PESO 2 CAMION");
        int peso2=scanner.nextInt();
        System.out.println("PESO 3 CAMION");
        int peso3=scanner.nextInt();
        if(peso1 > peso2 && peso1 > peso3 ){
            System.out.println("PESO 1 ES MAYOR "+peso1);
    } else if(peso2>peso1 && peso2>peso3){
                System.out.println("PESO 2 ES MAYOR");
        }else if(peso3>peso2 && peso3>peso1){
                System.out.println("PESO3 ES MAYOR");
    }
        if( peso1<peso2 && peso1<peso3){
            System.out.println("PESO 1 ES MENOR");
    }
        if(peso2<peso1 && peso2<peso1){
            System.out.println("PESO 2 ES MENOR");
            
        }
        if(peso3<peso2 && peso3<peso1){
            System.out.println("PESO3 ES MENOR");
        }
    }
}
