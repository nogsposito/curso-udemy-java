package application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Dados do contrato:");

        System.out.println("Número:");
        int numero = sc.nextInt();

        System.out.println("Data (dd/MM/yyyy):");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

        System.out.println("Valor:");
        double valor = sc.nextDouble();

        System.out.println("Número de parcelas:");
        int numero_de_parcelas = sc.nextInt();

        System.out.println("Parcelas:");

        sc.close();
    }
}
