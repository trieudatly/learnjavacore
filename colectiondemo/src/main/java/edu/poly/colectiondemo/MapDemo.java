/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.colectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author lytri
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Samsung", 200d);
        map.put("Nokia", 100d);
        map.put("Sony", 300d);
        map.put("Vivo", 400d);
        System.out.println("Map: " + map.toString());
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.print("Key: " + entry.getKey());
            System.out.println(" - Value: " + entry.getValue());

        }
        map.forEach((k, v) -> System.out.println("key " + k + " - value " + v));
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(map.get(key));
        }
    }
}
