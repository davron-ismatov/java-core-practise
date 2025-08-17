package org.example.javacoreandspringpractise.collectionFrmwrk;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(null,i+1);
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println("Name " + stringIntegerEntry.getKey());
            System.out.println("Age " + stringIntegerEntry.getValue());
        }
    }
}
