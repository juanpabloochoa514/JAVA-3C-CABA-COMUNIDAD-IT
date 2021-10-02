package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;
public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO ");
        double numero1 = scanner.nextDouble();
        System.out.println("INGRESE otro NUMERO ");
        double numero2 = scanner.nextDouble();
        double resultado,MCM=0;
        while(numero2!=0){
            MCM=numero1%numero2;
            if(numero2==0){
                System.out.println("ESCRIBA NUEVAMENTE EL NUMERO 2");
            }
            System.out.println("INGRESE otro NUMERO ");
            numero2 = scanner.nextDouble();
        }
        resultado=(numero1*numero2)/MCM;
        System.out.println("EL MCM ES "+resultado);
    }
}
