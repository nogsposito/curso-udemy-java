package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyCoverter;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do dólar: ");
        double dolar = sc.nextDouble();

        System.out.println("Quantos doláres serão comprados?");
        double quantity = sc.nextDouble();

        double result = CurrencyCoverter.result(dolar, quantity);

        System.out.println("Amount: " + result);

        sc.close();

    }
}
