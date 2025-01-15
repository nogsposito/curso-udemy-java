package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) throws Exception{
        
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // deve especificar fuso

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(d04.format(fmt1));
        
        System.out.println(fmt1.format(d04));
        System.out.println(fmt2.format(d06));
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r4);

        System.out.println(d04.getDayOfMonth());
        System.out.println(d04.getMonthValue());
        System.out.println(d04.getYear());

        System.out.println(d05.getHour());
        System.out.println(d05.getDayOfWeek());

        sc.close();

    }
    
}
