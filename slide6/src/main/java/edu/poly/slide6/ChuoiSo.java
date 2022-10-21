/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide6;

import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class ChuoiSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi so phan cach bang dau phay: ");
        String chuoi = sc.nextLine();
        String[] arr = chuoi.split(",");
        for (String item : arr) {
            int num = Integer.parseInt(item);
            if (num % 2 == 0) {
                System.out.print(" " + num);
            }
        }
        System.out.println("\nKet thuc");
    }
}
