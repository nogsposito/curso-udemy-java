package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<>();

        System.out.println("Quantos contribuintes?");
        int contribuintes = sc.nextInt();

        for (int i = 0; i < contribuintes; i++){

            System.out.println("Pessoa número " + (i+1) + ":");

            System.out.println("Nome?");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Renda anual?");
            double renda = sc.nextDouble();

            System.out.println("Pessoa física ou jurídica?");
            char fisicaOuJuridica = sc.next().charAt(0);

            if (fisicaOuJuridica == 'f'){

                System.out.println("Gastos com saúde?");
                double gastos_com_saude = sc.nextDouble();

                list.add(new PessoaFisica(nome, renda, gastos_com_saude));
            
            } else if (fisicaOuJuridica == 'j'){

                System.out.println("Número de funcionários?");
                int numero_de_funcionarios = sc.nextInt();

                list.add(new PessoaJuridica(nome, renda, numero_de_funcionarios));
            }

        }

        for (Contribuinte contribuinte : list){
            System.out.println(contribuinte.toString());
        }

        sc.close();
    }
}
