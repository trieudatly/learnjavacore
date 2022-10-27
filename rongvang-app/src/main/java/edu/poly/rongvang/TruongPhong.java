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
public class TruongPhong extends NhanVien {
    
    private double luongTrachNhiem;
    
    public TruongPhong() {
        super("Truong Phong");
    }
    
    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }
    
    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }
    
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Luong trach nhiem: ");
        luongTrachNhiem = sc.nextDouble();
        sc.nextLine();
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" - Luong trach nhiem: %f", luongTrachNhiem);
    }
    
    @Override
    double getThuNhap() {
        return getLuong() + getLuongTrachNhiem();
    }
    
}
