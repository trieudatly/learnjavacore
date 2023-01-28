package edu.poly.colectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lytri
 */
public class Colectiondemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(8);
        list.add(4);
        System.out.println("List" + list.toString());
        Collections.sort(list);
        System.out.println("List" + list.toString());
        Collections.shuffle(list);
        System.out.println("List" + list.toString());
        Collections.sort(list, (a, b) -> b - a);
        System.out.println("List" + list.toString());
        Collections.sort(list);
        if (Collections.binarySearch(list, 8) >= 0) {
            System.out.println("8 in list");
        }
        if (Collections.binarySearch(list, 10) >= 0) {
            System.out.println("10 in list");
        } else {
            System.out.println("10 not in list");
        }
    }
}
