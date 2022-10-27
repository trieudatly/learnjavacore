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
public class NhanVienTiepThi extends NhanVien {
    
    private double doanhSo, hueHong;
    
    public NhanVienTiepThi() {
        super("Tiep Thi");
    }
    
    public double getDoanhSo() {
        return doanhSo;
    }
    
    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }
    
    public double getHueHong() {
        return hueHong;
    }
    
    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
    
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Doanh so: ");
        doanhSo = sc.nextDouble();
        System.out.print("Hue Hong: ");
        hueHong = sc.nextDouble();
        sc.nextLine();
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" - Doanh so: %f - Hue hong: %f", doanhSo, hueHong);
    }
    
    @Override
    double getThuNhap() {
        return getLuong() + doanhSo * hueHong / 100;
    }
    
}
