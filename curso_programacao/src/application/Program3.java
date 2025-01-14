package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program3 {
    public static void main(String[] args) throws Exception{
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("vini");
        list.add("carol");
        list.add(0, "poggi");
        list.add("victor");
        list.add("cerols");

        System.out.println(list.size());

        list.remove("poggi");
        list.remove(0);

        for (String x : list){
            System.out.println(x);
        }

        list.removeIf(x -> x.charAt(0) == 'c');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println(list.indexOf("victor"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'v').collect(Collectors.toList());

        for(String x : result){
            System.out.println(x);
        }
        
        sc.close();
    }
}
