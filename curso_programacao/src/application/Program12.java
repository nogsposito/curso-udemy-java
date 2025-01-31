package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        method1();

        System.out.println("Fim!");

    }

    public static void method1(){
        System.out.println("method 1 start");
        method2();
        System.out.println("method1 end");
    }

    public static void method2(){

        System.out.println("METHOD 2 START");

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida! Tente novamente");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e){
            System.out.println("Input error! Tente novamente");
        }

        System.out.println("method2 end");

        sc.close();

    }
}
