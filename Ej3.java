package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        double resultado;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ESCRIBA UN NUMERO N");
        double num1 = scanner.nextDouble();
        System.out.println("ESCRIBA OTRO NUEMRO M");
        double num2=scanner.nextDouble();
        if(num2>0){
            resultado=num1/num2;
            System.out.println("resultado "+resultado);
        }else{
            System.out.println("numero 2 M es 0 , error");
        }
    }
}
