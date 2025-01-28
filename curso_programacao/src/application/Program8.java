package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct2;
import entities.Product2;
import entities.UsedProduct2;

public class Program8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos?");

        int repeticoes = sc.nextInt();

        List<Product2> list = new ArrayList<>();

        for (int i = 0; i < repeticoes; i++){

            System.out.println("Produto número " + (i+1) + ":");
            System.out.println("Comum, usado ou importado?");
            
            char comumUsadoImportado = sc.next().charAt(0);

            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Price:");
            double price = sc.nextDouble();

            if (comumUsadoImportado == 'c'){
                list.add(new Product2(name, price));
            } else if (comumUsadoImportado == 'i'){
                System.out.println("Custom fee");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct2(name, price, customsFee));
            } else if (comumUsadoImportado == 'u'){
                System.out.println("Data de fabricação (dd/MM/yyyy): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct2(name, price, date));
            }

        }

        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO:");
        for (Product2 prod : list){
            System.out.println(prod.priceTag());
        }

        sc.close();
        
    }
}
