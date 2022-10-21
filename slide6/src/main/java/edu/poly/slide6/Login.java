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
public class Login {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap username: ");
        String username = s.nextLine();
        System.out.println("Nhap password: ");
        String password = s.nextLine();
        if (username.equalsIgnoreCase("hello") && password.length() > 6) {
            System.out.println("dang nhap thanh cong");
        } else {
            System.out.println("sai username hoac password");
        }
    }
}
