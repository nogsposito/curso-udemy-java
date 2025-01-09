package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        Product prod = new Product();

        prod.setName("TV");
        System.out.println("Nome do produto: ");

        sc.close();

    }
}
