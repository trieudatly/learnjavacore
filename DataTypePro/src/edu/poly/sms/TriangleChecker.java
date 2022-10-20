package edu.poly.sms;

import java.util.Scanner;

public class TriangleChecker {

    public static void main(String[] args) {
        float a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("a: ");
        a = s.nextFloat();
        System.out.print("b: ");
        b = s.nextFloat();
        System.out.print("c: ");
        c = s.nextFloat();
        boolean condition1 = a + b > c ? true : false;
        boolean condition2 = a + c > b ? true : false;
        boolean condition3 = b + c > a ? true : false;
        String result = condition1 && condition2 && condition3 == true ? "triangle" : "not traingle";
        System.out.println("" + result);
    }
}
