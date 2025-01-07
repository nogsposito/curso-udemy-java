package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os lados do primeiro triângulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Digite os lados do segundo triângulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("AREA TRIANGULO X: " + areaX);
        System.out.println("AREA TRIANGULO Y: " + areaY);

        if (areaX >  areaY){
            System.out.println("TRAINGULO MAIOR: X");
        } else {
            System.out.println("TRIANGULO MAIOR: Y");
        }
        
        sc.close();

    }
}
