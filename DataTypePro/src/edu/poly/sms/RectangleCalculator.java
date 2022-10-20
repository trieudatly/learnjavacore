package edu.poly.sms;

import java.util.Scanner;

public class RectangleCalculator {

    public static void main(String[] args) {
        float width = 0;
        float height = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = s.nextFloat();
        System.out.print("Enter Height: ");
        height = s.nextFloat();
        float area = width * height;
        float perimeter = (width + height) * 2;
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);

    }
}
