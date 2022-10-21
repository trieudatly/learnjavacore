/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class DanhSachCauHoi {

    public static void main(String[] args) {
        ArrayList<String> ds = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap chuoi thu %d", i + 1);
            String st = s.nextLine();
            ds.add(st);
        }
        Collections.shuffle(ds);
        System.out.println("Gia tri cac phan tu: \n");
        for (String d : ds) {
            System.out.printf(" %s", d);
        }
        System.out.println();
    }
}
