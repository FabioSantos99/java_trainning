package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Select the shapes that you want -> rect/circle: ");
        char ch = sc.next().charAt(0);
        System.out.println("Select the color of shape: RED/BLUE/BLACK");
        Color color = Color.valueOf(sc.next());

        System.out.println(" ");

        if (ch == 'r') {
            System.out.print("Width: ");
            Double width = sc.nextDouble();
            System.out.print("Height: ");
            Double height = sc.nextDouble();
            Rectangle rect = new Rectangle(color, width, height);
            System.out.println(rect.area());
        }

        else if (ch == 'c') {
            System.out.print("Measures: ");
            Double radius = sc.nextDouble();
            Circle circle = new Circle(color, radius);
            System.out.println(circle.area());
        }

        sc.close();
    }
}
