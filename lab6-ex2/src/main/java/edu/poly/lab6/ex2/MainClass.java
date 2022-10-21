/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.lab6.ex2;

import java.util.ArrayList;

/**
 *
 * @author lytri
 */
public class MainClass {

    public static void main(String[] args) {
        ArrayList<SanPham> listSP = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            listSP.add(sp);
        }
        for (SanPham sanPham : listSP) {
            if (sanPham.getHang().equalsIgnoreCase("Nokia")) {
                sanPham.xuat();
                System.out.println("");
            }
        }
    }
}
