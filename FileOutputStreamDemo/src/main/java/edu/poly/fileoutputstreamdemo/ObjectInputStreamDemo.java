/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.fileoutputstreamdemo;

import edu.poly.fileoutputstreamdemo.models.Product;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author lytri
 */
public class ObjectInputStreamDemo {

    public static void main(String[] args) {
        try ( FileInputStream fin = new FileInputStream("C:/netbean_wordspace/product.dat");  ObjectInputStream ois = new ObjectInputStream(fin);) {
            Product pro = (Product) ois.readObject();
            System.out.println("Product ID: " + pro.getProductId());
            System.out.println("Name: " + pro.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
