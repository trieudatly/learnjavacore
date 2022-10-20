package edu.poly.sms;

import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        String hoTen = "";
        byte tuoi = 0;
        float diem = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = s.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = s.nextByte();
        System.out.print("Nhap diem: ");
        diem = s.nextFloat();
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Diem: " + diem);
    }
}
