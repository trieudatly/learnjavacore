/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide7;

/**
 *
 * @author lytri
 */
public class NhanVien {

    protected String hoten;
    protected double luong;

    public NhanVien() {
    }

    public NhanVien(String hoten, double luong) {
        this.hoten = hoten;
        this.luong = luong;
    }

    public double tinhThueThuNhap() {
        return luong * 0.1;
    }

    public void xuat() {
        System.out.printf("Ho ten: %s - luong: &f", hoten, luong);
    }

    public double tinhThuNhap() {
        return luong;
    }
}
