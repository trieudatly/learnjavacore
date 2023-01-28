/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edu.poly.lab5;

import edu.poly.lab5.model.Student;
import edu.poly.lab5.utils.XFile;
import java.io.IOException;

/**
 *
 * @author lytri
 */
public class Lab5 {

    public static void main(String[] args) {
        try {
            String path = "C:/netbean_wordspace/lab5.dat";
            XFile.write(path, "Hello world!How are you today?".getBytes());
            byte[] data = XFile.read(path);
            System.out.println("Read data: " + new String(data));
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try {
            Student stu = new Student("Hung", 10, "programming");
            String path = "C:/netbean_wordspace/lab5_2.dat";
            XFile.writeObject(path, stu);
            Student std = (Student) XFile.readObject(path);
            System.out.println("Name: " + std.getName());
            System.out.println("Mark: " + std.getMark());
            System.out.println("Major: " + std.getMajor());
            System.out.println("Grade: " + std.getGrade());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
