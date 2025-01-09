package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double radius = sc.nextDouble();

        double c = Calculator.circunference(radius);
        double v = Calculator.volume(radius);

        System.out.println(c + " " + v + " " + Calculator.PI);
        
        sc.close();

    }
}
