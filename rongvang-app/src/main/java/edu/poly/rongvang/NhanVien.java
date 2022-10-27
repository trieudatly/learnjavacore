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
public abstract class NhanVien {

    String ma, hoTen, loai;
    double luong;

    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen, String loai, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.loai = loai;
        this.luong = luong;
    }

    public NhanVien(String loai) {
        this.loai = loai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void nhap(Scanner sc) {
        System.out.print("Ma: ");
        this.ma = sc.nextLine();
        System.out.print("Ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Luong: ");
        this.luong = sc.nextDouble();
        sc.nextLine();
    }

    public void xuat() {
        System.out.printf("Ma: %s - Ho ten: %s - Loai: %s - Luong: %s - Thu nhap: %f", ma, hoTen, loai, luong, getThuNhap());
    }

    abstract double getThuNhap();
}
