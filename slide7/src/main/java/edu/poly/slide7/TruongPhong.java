/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide7;

/**
 *
 * @author lytri
 */
public class TruongPhong extends NhanVien {

    protected double trachNhiem;

    public TruongPhong(double trachNhiem, String hoten, double luong) {
        super(hoten, luong);
        this.trachNhiem = trachNhiem;
    }

    public void xuat() {
        System.out.printf("Trach nhiem: %f", trachNhiem);
    }

    @Override
    public double tinhThuNhap() {
        return luong + trachNhiem;
    }
}
