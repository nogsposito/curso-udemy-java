package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Dados do aluguel:");
        System.out.println("Modelo do carro:");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy)");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Retorno:");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Preço por hora:");
        double pricePerHour = sc.nextDouble();

        System.out.println("Preço por dia:");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + cr.getInvoice().getBasicPayment());
        
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
