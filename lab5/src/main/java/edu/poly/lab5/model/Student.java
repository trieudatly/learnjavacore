/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.lab5.model;

import java.io.Serializable;

/**
 *
 * @author lytri
 */
public class Student implements Serializable {

    private String name;
    private float mark;
    private String major;

    public Student() {
    }

    public Student(String name, float mark, String major) {
        this.name = name;
        this.mark = mark;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        if (mark > 9) {
            return "Xuat sac";
        }
        return "trung binh";

    }
}
