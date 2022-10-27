/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide7;

/**
 *
 * @author lytri
 */
public class SinhVienIT extends SinhVien {

    protected float diemJava, diemCss;

    public SinhVienIT(String hoTen, float diemJava, float diemCss) {
        super(hoTen);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
    }

    @Override
    float tinhDiemTB() {
        return (diemCss + diemJava * 2) / 3;
    }

}
