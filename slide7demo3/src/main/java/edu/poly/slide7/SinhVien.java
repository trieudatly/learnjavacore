/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide7;

/**
 *
 * @author lytri
 */
public abstract class SinhVien {

    protected String hoTen;

    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    abstract float tinhDiemTB();
}
