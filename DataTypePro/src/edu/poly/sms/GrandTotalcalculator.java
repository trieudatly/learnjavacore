package edu.poly.sms;

import java.util.Scanner;

public class GrandTotalcalculator {

    public static void main(String[] args) {
        double price;
        int quantity;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter price: ");
        String st = s.nextLine();
        price = Double.parseDouble(st);
        System.out.print("Enter quantity: ");
        st = s.nextLine();
        quantity = Integer.parseInt(st);
        double grand = price * quantity;
        System.out.println("Grand Total: " + grand);

    }
}
