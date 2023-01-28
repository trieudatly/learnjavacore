/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edu.poly.fileoutputstreamdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author lytri
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:/netbean_wordspace/hello.dat");
            String st = "Hello! How are you today";
            fos.write(st.getBytes());
            fos.write(st.getBytes());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
            }
        }
    }
}
