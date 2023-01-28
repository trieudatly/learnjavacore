/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.multithreading;

/**
 *
 * @author lytri
 */
public class EvenThread extends Thread {

    public void run() {
        for (int i = 0; i < 20; i += 2) {
            System.out.println(" " + i);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
        System.out.println("");
    }
}
