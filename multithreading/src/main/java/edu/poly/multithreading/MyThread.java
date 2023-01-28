/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.multithreading;

/**
 *
 * @author lytri
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {

            }
        }
    }
}
