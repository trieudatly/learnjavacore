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
public class DataValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Email: ");
        String email = sc.nextLine();
//        System.out.print("So dien thoai Hue: ");
//        String phone = sc.nextLine();
        String regEmail;
        regEmail = "(\\S+)@(\\S+)\\.(\\S+)";
        if (email.matches(regEmail)) {
            System.out.println("Email hop le");
        } else {
            System.out.println("Email khong hop le");
        }
//        String regPhone = "0543\\d{6}";
//        if (phone.matches(regPhone)) {
//            System.out.println("Phone hop le");
//        } else {
//            System.out.println("Phone khong hop le hoac khong o Hue");
//        }
    }
}
