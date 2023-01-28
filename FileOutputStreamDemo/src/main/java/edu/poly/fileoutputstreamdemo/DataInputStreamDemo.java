/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.fileoutputstreamdemo;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 *
 * @author lytri
 */
public class DataInputStreamDemo {

    public static void main(String[] args) {
        try ( FileInputStream fin = new FileInputStream("C:/netbean_wordspace/hihihi.dat");  DataInputStream dis = new DataInputStream(fin);) {
            String st = dis.readUTF();
            int age = dis.readInt();
            System.out.println("read data: ");
            System.out.println("Message: " + st);
            System.out.println("Age: " + age);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
