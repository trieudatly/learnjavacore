/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.lab6.ex3;

import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class SinhVien {

    private String hoTen, email, sdt, cmnd;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public SinhVien() {
    }

    public void nhap(Scanner sc) {
        do {
            System.out.print("Nhap ho ten: ");
            hoTen = sc.nextLine();
            if (hoTen == null || hoTen.equals("")) {
                System.out.println("Ho ten khong hop le.Vui long nhap lai");
            } else {
                break;
            }
        } while (true);

        DataValidator dv = new DataValidator();

        do {
            System.out.print("Email: ");
            email = sc.nextLine();
            if (dv.isEmail(email)) {
                break;
            }
            System.out.println("Email khong hop le");
        } while (true);

        do {
            System.out.print("sdt: ");
            sdt = sc.nextLine();
            if (dv.isSdt(sdt)) {
                break;
            }
            System.out.println("Sdt khong hop le");
        } while (true);

        do {
            System.out.print("cmnd: ");
            cmnd = sc.nextLine();
            if (dv.isCmnd(cmnd)) {
                break;
            }
            System.out.println("Cmnd khong hop le");
        } while (true);

    }

    public void xuat() {
        System.out.printf("Ho ten %s - email: %s - sdt: %s - cmnd: %s \n", hoTen, email, sdt, cmnd);
    }
}
