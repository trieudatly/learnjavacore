/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide3;

import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class MangSo {

    public static void main(String[] args) {
        int[] mang = new int[10];
        Scanner s = new Scanner(System.in);
        int i = 0;
        do {
            System.out.printf("mang [%d]= ", i);
            mang[i] = s.nextInt();
            i++;
        } while (i < 10);
        int sum = 0;
        for (int j : mang) {
            sum += j;
        }
        System.out.println("Tong cac phan tu mang: " + sum);
        float avg = (float) sum / mang.length;
        System.out.println("Gia tri trung binh cua cac phan tu trong mang: " + avg);
    }
}
