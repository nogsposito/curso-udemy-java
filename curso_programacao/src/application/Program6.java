package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program6 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Nome do departamento:");
        String departmentName = sc.nextLine();

        System.out.println("Nome do trabalhador: ");
        String workerName = sc.nextLine();

        System.out.println("Nível do trabalhador:");
        String workerLevel = sc.nextLine();

        System.out.println("Salário base do trabalhador: ");
        double baseSalary = sc.nextDouble();

        Worker trabalhador = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("Quantos contratos?");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++){
            System.out.println("Contrato " + (i+1) + ": ");

            System.out.println("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());

            System.out.println("Valor por hora:");
            double valuePerHour = sc.nextDouble();

            System.out.println("Duration (hours):");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            trabalhador.addContract(contract);

        }

        System.out.println("Entre com mês e ano (MM/yyyy):");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + trabalhador.getDepartment().getName());
        System.out.println("Income: " + trabalhador.income(year, month));

        sc.close();
    }

}
