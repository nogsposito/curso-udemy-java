package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        double tri1a, tri1b, tri1c;
        double tri2a, tri2b, tri2c;

        System.out.println("Digite os lados do primeiro triângulo: ");
        tri1a = sc.nextDouble();
        tri1b = sc.nextDouble();
        tri1c = sc.nextDouble();
        
        System.out.println("Digite os lados do segundo triângulo: ");
        tri2a = sc.nextDouble();
        tri2b = sc.nextDouble();
        tri2c = sc.nextDouble();

        int biggest = maior(tri1a, tri1b, tri1c, tri2a, tri2b, tri2c);

        System.out.println("MAIOR: TRIANGULO " + biggest);
        
        sc.close();

    }

    public static int maior(double tri1a, double tri1b, double tri1c, double tri2a, double tri2b, double tri2c){
        
        double area1, area2;
        double p1, p2;
        
        p1 = ((tri1a + tri1b + tri1c)/2);
        area1 = Math.sqrt(p1*(p1-tri1a)*(p1-tri1b)*(p1-tri1c));
        
        p2 = ((tri2a + tri2b + tri2c)/2);
        area2 = Math.sqrt(p2*(p2-tri2a)*(p2-tri2b)*(p2-tri2c));
        
        System.out.println("Area do 1: " + area1);
        System.out.println("Area do 2: " + area2);
        
        if (area1 > area2){
            return 1;
        }else{
            return 2;
        }

    }
}
