/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.lab6.ex2;

import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class SanPham {

    private String tenSp;
    private double donGia;
    private String hang;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten Sp:");
        tenSp = sc.nextLine();

        System.out.print("Don gia: ");
        donGia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Hang SX: ");
        hang = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("Ten: %s - don gia: %f - hang sx: %s", tenSp, donGia, hang);

    }
}
