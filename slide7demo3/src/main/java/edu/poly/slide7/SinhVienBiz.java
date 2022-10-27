/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide7;

/**
 *
 * @author lytri
 */
public class SinhVienBiz extends SinhVien {

    protected float ketoan, marketing, banhang;

    public SinhVienBiz(String hoTen, float ketoan, float marketing, float banhang) {
        super(hoTen);
        this.ketoan = ketoan;
        this.marketing = marketing;
        this.banhang = banhang;
    }

    @Override
    float tinhDiemTB() {
        return (ketoan + marketing + banhang) / 3;
    }

}
