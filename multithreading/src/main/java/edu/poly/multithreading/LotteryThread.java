/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.multithreading;

import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author lytri
 */
public class LotteryThread extends Thread {

    private JTextField txt;

    public LotteryThread(JTextField txt) {
        this.txt = txt;
    }

    public void run() {
        Date now = new Date();
        Random rnd = new Random(now.getTime());
        for (int i = 0; i < 1000; i++) {
            int num = Math.abs(rnd.nextInt() % 10);
            txt.setText("" + num);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(LotteryThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
