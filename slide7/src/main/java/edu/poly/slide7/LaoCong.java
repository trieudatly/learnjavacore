/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide7;

/**
 *
 * @author lytri
 */
public class LaoCong extends NhanVien {

    protected double luongGio;
    protected int soGioLam;

    public LaoCong(double luongGio, int soGioLam, String hoten, double luong) {
        super(hoten, luong);
        this.luongGio = luongGio;
        this.soGioLam = soGioLam;
    }

    @Override
    public double tinhThuNhap() {
        return luongGio * soGioLam;
    }
}
