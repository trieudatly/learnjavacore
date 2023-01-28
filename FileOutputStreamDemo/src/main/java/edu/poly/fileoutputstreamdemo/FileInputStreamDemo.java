/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.fileoutputstreamdemo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author lytri
 */
public class FileInputStreamDemo {

    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("C:/netbean_wordspace/hello.dat");
            byte[] buffer = new byte[1024];
            int lenght;
            while ((lenght = fin.read(buffer, 0, 1024)) > 0) {
                String st = new String(buffer, 0, lenght);
                System.out.println("Read String: " + st);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                fin.close();
            } catch (IOException ex) {

            }
        }
    }
}
