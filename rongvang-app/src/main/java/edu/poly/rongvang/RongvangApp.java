/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edu.poly.rongvang;

import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class RongvangApp {

    public static void main(String[] args) {
        DanhSachNhanVien ds = new DanhSachNhanVien();
        ds.nhap();
        ds.xuat();
        Scanner sc = new Scanner(System.in);
        //ds.timVaHienThiTheoMa(sc);
        //ds.xoaNhanVienTheoMa(sc);
        //ds.capNhatTheoMa(sc);
        ds.sapXepTheoTen();
        ds.xuat();
        //ds.timTheoKhoanLuong(sc);

    }
}
