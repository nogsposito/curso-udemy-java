package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;


public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        int numero;
        String nome;
        double deposito;
        int querDepositoInicial;

        System.out.println("Número da conta: ");
        numero = sc.nextInt();

        System.out.println("Nome: ");
        sc.nextLine();
        nome = sc.nextLine();

        System.out.println("Depósito Inicial?");
        querDepositoInicial = sc.nextInt();

        if (querDepositoInicial == 1){
            
            System.out.println("Depósito: ");
            deposito = sc.nextDouble();

        } else {

            deposito = 0;
            
        }

        Conta conta = new Conta(numero, nome, deposito);

        System.out.println(conta.print());

        System.out.println("Valor de depósito: ");
        double novoDeposito = sc.nextDouble();
        conta.depositar(novoDeposito);

        System.out.println(conta.print());

        System.out.println("Valor do saque: ");
        double novoSaque = sc.nextDouble();
        conta.sacar(novoSaque);

        System.out.println(conta.print());

        sc.close();

    }
}
