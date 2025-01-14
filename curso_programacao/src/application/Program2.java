package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            total += vect[i].getPrice();
        }

        double average = total / vect.length;
        System.out.println(average);

        sc.close();

    }
}
