/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.fileoutputstreamdemo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author lytri
 */
public class DataOutputStreamDemo {

    public static void main(String[] args) {
        try ( FileOutputStream fos = new FileOutputStream("C:/netbean_wordspace/hihihi.dat");  DataOutputStream dos = new DataOutputStream(fos);) {
            dos.writeUTF("Hello World!");
            dos.writeInt(25);
            System.out.println("Successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
