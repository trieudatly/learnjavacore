/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.lab6.ex3;

/**
 *
 * @author lytri
 */
public class DataValidator {

    public boolean isEmail(String st) {
        String pattern = "(\\S+)@(\\S+)\\.(\\S+)";
        return st.matches(pattern);
    }

    public boolean isSdt(String st) {
        String pattern = "0\\d{9}";// so di dong
        return st.matches(pattern);
    }

    public boolean isCmnd(String st) {
        String pattern = "\\d{9}";
        return st.matches(pattern);
    }
}
