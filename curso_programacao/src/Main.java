import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int higher = max(x, y, z);

        showResult(higher);
        
        sc.close();

    }

    public static int max (int a, int b, int c){
        
        int aux;

        if (a > b && a > c){
            aux = a;
        } else if (b > a && b > c){
            aux = b;
        } else {
            aux = c;
        }

        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher: " + value);
    }
}