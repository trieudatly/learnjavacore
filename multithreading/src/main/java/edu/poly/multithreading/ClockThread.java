/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author lytri
 */
public class ClockThread extends Thread {

    private JButton button;

    public ClockThread(JButton button) {
        this.button = button;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {
            Date now = new Date();
            String st = sdf.format(now);
            button.setText(st);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }

        }
    }
}
