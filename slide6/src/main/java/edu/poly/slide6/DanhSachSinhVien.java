/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class DanhSachSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int i = 1;
        do {
            System.out.printf("Nhap ho ten sinh vien thu %d: ", i);
            String hoten = sc.nextLine();
            if (hoten == null || hoten.trim().equals("")) {
                System.out.println("sai");
                break;
            }
            list.add(hoten);
            i++;
        } while (i <= 5);

        for (String item : list) {
            item = item.trim();
            if (item.startsWith("Nguyen ") || item.endsWith(" Tuan")) {
                String ho = item.substring(0, item.indexOf(" "));
                String ten = item.substring(item.lastIndexOf(" "));
                String tenDem = item.substring(item.indexOf(" "), item.lastIndexOf(" "));
                System.out.printf("Ho ten: %s %s %s\n", ho.toUpperCase(), tenDem, ten.toUpperCase());
            }
        }
        for (String item : list) {
            if (item.indexOf(" My ") > 0) {
                System.out.println("ho ten: " + item);
            }
        }
    }

}
