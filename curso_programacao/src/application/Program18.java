package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Set<Integer> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Quaaaaaantos do curso A?");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++){
            set.add(sc.nextInt());
        }

        System.out.println("Quaaaaaantos do curso B?");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++){
            set.add(sc.nextInt());
        }

        System.out.println("Quaaaaaantos do curso C?");
        int c = sc.nextInt();
        for (int i = 0; i < c; i++){
            set.add(sc.nextInt());
        }

        System.out.println("Total de alunos: " + set.size());

        sc.close();
    }
}
