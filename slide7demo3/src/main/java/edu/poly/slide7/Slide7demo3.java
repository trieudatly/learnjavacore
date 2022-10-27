/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edu.poly.slide7;

/**
 *
 * @author lytri
 */
public class Slide7demo3 {

    public static void main(String[] args) {
        SinhVien sv;
        sv = new SinhVienIT("Thanh", 8, 9);
        System.out.println("TB: " + sv.tinhDiemTB());
        System.out.println("-------------");
        sv = new SinhVienBiz("Tin", 3, 7, 8);
        System.out.println("TB: " + sv.tinhDiemTB());

    }
}
