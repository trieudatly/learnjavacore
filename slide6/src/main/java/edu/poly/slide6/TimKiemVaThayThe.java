/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide6;

import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class TimKiemVaThayThe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thong tin: ");
        String content = sc.nextLine();
        System.out.print("Nhap noi dung can tim: ");
        String find = sc.nextLine();
        System.out.print("Nhap noi dung thay the: ");
        String replace = sc.nextLine();
        String result = content.replaceAll(find, replace);
        System.out.println("Noi dung sau khi thay the: " + result);
    }

}
