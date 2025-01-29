package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        int numberOfShapes = sc.nextInt();

        for (int i = 0; i < numberOfShapes; i++){
            char rectangleOrCircle = sc.next().charAt(0);
            sc.nextLine();
            Color color = Color.valueOf(sc.next());

            if (rectangleOrCircle == 'r'){

                double width = sc.nextDouble();
                double height = sc.nextDouble();

                list.add(new Rectangle(color, width, height));

            } else if (rectangleOrCircle == 'c'){

                double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }

        }

        for (Shape shape : list){
            System.out.println(shape.area());;
        }

        sc.close();

    }
}
