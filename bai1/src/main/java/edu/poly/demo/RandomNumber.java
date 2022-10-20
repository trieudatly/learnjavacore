package edu.poly.demo;

public class RandomNumber {

    public static void main(String[] args) {
        double num = 0;
        num = Math.random();//0-1
        System.out.println("Random number: " + num);
        //xuất ra 1 số ngẫu nhiên trong khoản 5->12
        num = num * 7 + 5;
        System.out.println("Random number(5-12): " + num);
        double sqrt = Math.sqrt(num);
        System.out.println("Square root: " + sqrt);
    }
}
