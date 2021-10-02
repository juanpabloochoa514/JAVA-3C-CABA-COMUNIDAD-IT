
package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;
public class Ej20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double nota,promedio=0,suma=0;
        int i=0;
        System.out.println("NOTA DEL ALUMNO -1 , PARA SALIR DEL PROGRAMA");
        nota=scanner.nextDouble();
        while(nota!=-1){
            suma+=nota;
            i++;
            System.out.println("NOTA DEL ALUMNO -1 , PARA SALIR DEL PROGRAMA");
            nota=scanner.nextDouble();
        }
        promedio=suma/i;
        System.out.println("PROMEDIO DEL CURSO = "+promedio);
    }
}
