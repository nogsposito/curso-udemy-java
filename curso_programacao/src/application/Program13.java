package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{

            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println("Check-in:");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Check-out:");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update: ");
            System.out.println("Check-in: ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out: ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);

        } catch (ParseException e){
            System.out.println("Invalid format");
        } catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected error! " + e);
        }

        sc.close();
        
    }
}
