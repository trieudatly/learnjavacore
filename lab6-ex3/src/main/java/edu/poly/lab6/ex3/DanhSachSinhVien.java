/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.lab6.ex3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class DanhSachSinhVien {

    private ArrayList<SinhVien> listSp = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            SinhVien sv = new SinhVien();
            sv.nhap(sc);
            listSp.add(sv);
        }
    }

    public void xuat() {
        System.out.println("----------");
        System.out.println("Danh sach sinh vien: ");
        for (SinhVien sinhVien : listSp) {
            sinhVien.xuat();
        }
    }
}
