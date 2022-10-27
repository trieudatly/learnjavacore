/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.rongvang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class DanhSachNhanVien {

    private ArrayList<NhanVien> list = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        list.clear();
        do {
            System.out.print("Nhap loai nhan vien(nhap rong de thoat,1:hanh chinh,2:Truong phong,3:Tiep thi): ");
            String loai = sc.nextLine();
            if (loai == null || loai.equals("")) {
                break;
            }
            int iloai = Integer.parseInt(loai);
            switch (iloai) {
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    nvhc.nhap(sc);
                    list.add(nvhc);
                    break;
                case 2:
                    TruongPhong tp = new TruongPhong();
                    tp.nhap(sc);
                    list.add(tp);
                    break;
                case 3:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.nhap(sc);
                    list.add(nvtt);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }

    public void xuat() {
        System.out.println("Danh sach nhan vien: ");
        for (NhanVien nhanVien : list) {
            if (nhanVien instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) nhanVien).xuat();
            } else if (nhanVien instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) nhanVien).xuat();

            } else if (nhanVien instanceof TruongPhong) {
                ((TruongPhong) nhanVien).xuat();
            }
            System.out.println("\n---------");
        }
    }

    public void timVaHienThiTheoMa(Scanner sc) {
        System.out.print("Nhap ma can tim: ");
        String ma = sc.nextLine();
        NhanVien nvFound = null;
        for (NhanVien nhanVien : list) {
            if (nhanVien.getMa().equalsIgnoreCase(ma)) {
                nvFound = nhanVien;
                break;
            }
        }
        if (nvFound != null) {
            System.out.print("Thong tin nhan vien tim thay theo ma: ");
            nvFound.xuat();
        } else {
            System.out.println("Khong tim thay nhan vien co ma: " + ma);
        }

    }

    public void xoaNhanVienTheoMa(Scanner sc) {
        System.out.println("Xoa nhan vien theo ma");
        System.out.print("Nhap ma nhan vien can xoa: ");
        String ma = sc.nextLine();
        NhanVien nvFound = null;
        for (NhanVien nhanVien : list) {
            if (nhanVien.getMa().equalsIgnoreCase(ma)) {
                nvFound = nhanVien;
                break;
            }
        }
        if (nvFound != null) {
            list.remove(nvFound);
            System.out.println("Nhan vien da duoc xoa");
        } else {
            System.out.println("Khong tim thay nhan vien ca ma" + ma);
        }
    }

    public void capNhatTheoMa(Scanner sc) {
        System.out.println("Cap nhat thong tin nhan vien theo ma");
        System.out.print("Nhap ma nhan vien: ");
        String ma = sc.nextLine();
        NhanVien nvFound = null;
        for (NhanVien nhanVien : list) {
            if (nhanVien.getMa().equalsIgnoreCase(ma)) {
                nvFound = nhanVien;
                break;
            }
        }
        if (nvFound != null) {
            System.out.println("Nhap thong tin cap nhat cho nhan vien:");
            if (nvFound instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) nvFound).nhap(sc);
            } else if (nvFound instanceof TruongPhong) {
                ((TruongPhong) nvFound).nhap(sc);
            } else if (nvFound instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) nvFound).nhap(sc);
            }
        } else {
            System.out.println("khong tim thay nhan vien: " + ma);
        }
    }

    public void timTheoKhoanLuong(Scanner sc) {
        System.out.println("Tim nhan vien theo khoan luong");
        System.out.print("Nhap khoan luong thap nhat: ");
        double min = sc.nextDouble();
        System.out.print("Nhap khoan luong cao nhat: ");
        double max = sc.nextDouble();
        boolean found = false;
        for (NhanVien nhanVien : list) {
            if (min <= nhanVien.getLuong() && nhanVien.getLuong() <= max) {
                nhanVien.xuat();
                System.out.println();
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Khong co nhan vien nao co luong trong khoan can tim");
        }
    }

    public void sapXepTheoTen() {
        Collections.sort(list, (a, b) -> a.getHoTen().compareTo(b.getHoTen()));
    }

    public void sapXepTheoThuNhap() {
        Collections.sort(list, (a, b) -> (int) (a.getThuNhap() - b.getThuNhap()));
    }

    public void hienThiTop5() {
        Collections.sort(list, (a, b) -> (int) (a.getThuNhap() - b.getThuNhap()));
        System.out.println("Danh sach nhan vien co thu nhap cao nhat:");
        for (int i = 0; i < 5 && i < list.size(); i++) {
            list.get(i).xuat();
        }
    }
}
