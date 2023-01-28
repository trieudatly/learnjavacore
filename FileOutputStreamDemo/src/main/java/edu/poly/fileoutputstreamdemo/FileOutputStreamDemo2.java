/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.fileoutputstreamdemo;

import java.io.FileOutputStream;

/**
 *
 * @author lytri
 */
public class FileOutputStreamDemo2 {

    public static void main(String[] args) {
        try ( FileOutputStream fous = new FileOutputStream("C:/netbean_wordspace/welcome.dat");) {
            String st = "Wellcome to my try-resource in java";
            fous.write(st.getBytes());
            System.out.println("File created");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
