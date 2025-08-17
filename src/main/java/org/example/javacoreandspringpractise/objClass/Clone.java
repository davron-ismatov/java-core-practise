package org.example.javacoreandspringpractise.objClass;

import java.util.Comparator;

public class Clone implements Cloneable {
    public int x;

    public static void main(String[] args) throws CloneNotSupportedException {

        Clone clone = new Clone();
        clone.x = 5;
        Clone clone1 = (Clone) clone.clone();
        System.out.println(clone1.x);
        clone1.x = 10;
        System.out.println(clone.x);
    }
}
