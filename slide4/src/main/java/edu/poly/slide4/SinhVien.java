/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide4;

import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class SinhVien {

    String hoTen;
    double diemTB;

    public SinhVien() {
        hoTen = "AnhNN";
        diemTB = 8;
    }

    public SinhVien(String hoTen, double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = s.nextLine();
        System.out.print("Nhap diem TB: ");
        diemTB = s.nextDouble();

    }

    public void xuat() {
        System.out.printf("Ho ten sinh vien: %s-diem TB:%.1f-Hoc luc: %s", hoTen, diemTB, xepLoai());
    }

    public String xepLoai() {
        if (diemTB >= 9) {
            return "xuat sac";

        } else {
            return "gioi";

        }
    }
}
