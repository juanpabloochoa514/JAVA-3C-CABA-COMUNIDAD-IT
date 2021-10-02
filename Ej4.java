
package com.mycompany.unidad4practica3ej1;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("valor de temperatura 1");
        double tem1 = scanner.nextDouble();
        System.out.println("valor de temperatura 2");
        double tem2 = scanner.nextDouble();
        System.out.println("valor de temperatura 3");
        double tem3 = scanner.nextDouble();
        double SUMA,promedio;
        SUMA = tem1+tem2+tem3;
        promedio= SUMA/3;
        System.out.println("suma "+SUMA+"promedio"+promedio);
    }
}
