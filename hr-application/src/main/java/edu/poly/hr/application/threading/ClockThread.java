/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.hr.application.threading;

import com.sun.webkit.ThemeClient;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author lytri
 */
public class ClockThread extends Thread {
    
    private JLabel lbl;
    
    public ClockThread(JLabel lbl) {
        this.lbl = lbl;
    }
    
    public void run() {
        
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {
            Date now = new Date();
            String st = sdf.format(now);
            lbl.setText(st);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
