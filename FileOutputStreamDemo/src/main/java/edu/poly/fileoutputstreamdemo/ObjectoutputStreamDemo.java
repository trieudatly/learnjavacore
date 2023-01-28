/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.fileoutputstreamdemo;

import edu.poly.fileoutputstreamdemo.models.Product;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author lytri
 */
public class ObjectoutputStreamDemo {

    public static void main(String[] args) {
        try ( FileOutputStream fos = new FileOutputStream("C:/netbean_wordspace/product.dat");  ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            Product pro = new Product("P01", "Hat");
            oos.writeObject(pro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
