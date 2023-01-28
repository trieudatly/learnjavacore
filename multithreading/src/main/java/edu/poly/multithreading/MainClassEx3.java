/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lytri
 */
public class MainClassEx3 {

    public static void main(String[] args) {
        OddThread th1 = new OddThread();
        EvenThread th2 = new EvenThread();
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(MainClassEx3.class.getName()).log(Level.SEVERE, null, ex);
        }
        th2.start();
        System.out.println("Completed!!!");
    }
}
