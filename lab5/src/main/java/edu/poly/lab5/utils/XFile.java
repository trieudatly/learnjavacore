/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.lab5.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author lytri
 */
public class XFile {

    public static byte[] read(String path) throws FileNotFoundException, IOException {
        try ( FileInputStream fis = new FileInputStream(path);) {
            int lenght = fis.available();
            byte[] buffer = new byte[lenght];
            fis.read(buffer);
            return buffer;
        }
    }

    public static void write(String path, byte[] data) throws FileNotFoundException, IOException {
        try ( FileOutputStream fos = new FileOutputStream(path);) {
            fos.write(data);
        }
    }

    public static Object readObject(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        try ( FileInputStream fis = new FileInputStream(path);  ObjectInputStream ois = new ObjectInputStream(fis);) {
            return ois.readObject();
        }
    }

    public static void writeObject(String path, Object data) throws FileNotFoundException, IOException {
        try ( FileOutputStream fos = new FileOutputStream(path);  ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(data);
        }
    }
}
