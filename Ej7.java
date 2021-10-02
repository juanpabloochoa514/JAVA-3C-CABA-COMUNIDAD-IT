package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;
public class Ej7 {
    public static void main(String[] args) {
        int sec,horas,minutos,num;
        Scanner scanner =new Scanner(System.in);
        num=scanner.nextInt();
        horas=num/3600;
        minutos=(num-(3600*horas))/60;
        sec=num-((horas*3600)+(minutos*60));
        System.out.println("horas"+horas+"minutos"+minutos+"segundos"+sec);
    }
}
