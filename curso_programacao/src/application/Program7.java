package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program7 {
    public static void main(String[] args) {
        
        Account acc = new Account(1001, "Alex", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // upcasting:

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "BOB", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
        // downcasting:

        BusinessAccount acc4 = (BusinessAccount) acc2;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200);
            System.out.println("loan!");
        }
    }
}
