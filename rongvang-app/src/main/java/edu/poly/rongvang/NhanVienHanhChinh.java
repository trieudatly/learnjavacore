/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.rongvang;

import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class NhanVienHanhChinh extends NhanVien {

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
    }

    public NhanVienHanhChinh() {
        super("Hanh Chinh");
    }

    @Override
    double getThuNhap() {
        return getLuong();
    }

}
