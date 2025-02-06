package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;
import util.ProductPredicate;
import util.UpperCaseName;

public class Program19 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        
        Predicate<Product> pred = p -> p.getPrice() >= 100;

        list.removeIf(p -> p.getPrice() >= 100);

        for (Product p : list){
            System.out.println(p);
        }

        list.forEach(System.out::println);

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); // transforma em stream, usa map para aplicar a funcao a cada elemento para depois transformar em uma nova lista nova
        
        names.forEach(System.out::println);

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names2 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        sc.close();
    }
}
