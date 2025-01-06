import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        String original = "abc dEf ghi";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.substring(2, 6);
        String s04 = original.replace('c', 'x');
        String s05 = original.replace("abc", "xyz");
        String[] vect = original.split(" ");

        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(vect[0]);

        sc.close();

    }
}