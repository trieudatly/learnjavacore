/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class MangSinhVien {

    public static void main(String[] args) {
        String sv[] = new String[5];
        float diem[] = new float[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap sv thu %d: ", i + 1);
            sv[i] = s.nextLine();
            System.out.printf("Nhap diem thu %d: ", i + 1);
            diem[i] = s.nextFloat();
            s.nextLine();
        }
        System.out.println("Mang cac sinh vien " + Arrays.toString(sv));
        System.out.println("Mang diem sinh vien" + Arrays.toString(diem));
        //Arrays.sort(sv);
        for (int i = 0; i < diem.length - 1; i++) {
            for (int j = i + 1; j < diem.length; j++) {
                if (diem[i] < diem[j]) {
                    float temp = diem[j];
                    diem[j] = diem[i];
                    diem[i] = temp;
                    String st = sv[i];
                    sv[i] = sv[j];
                    sv[j] = st;
                }
            }
        }
        System.out.println("Mang cac sinh vien sau khi sap xep" + Arrays.toString(sv));
        System.out.println("Mang diem sau khi sap xep         " + Arrays.toString(diem));
    }
}
