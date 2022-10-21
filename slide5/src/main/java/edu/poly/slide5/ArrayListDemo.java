/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.slide5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lytri
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap phan tu thu %d:", i + 1);
            double d = s.nextDouble();
            nums.add(d);
        }
        double sum = 0;
        for (Double num : nums) {
            System.out.println(" " + num);
            sum += num;
        }
        System.out.println("tong cac so:" + sum);
    }
}
