package org.example.javacoreandspringpractise.accessModifier.pck2;

import org.example.javacoreandspringpractise.accessModifier.pkg.ProtectedEx;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public  class TestAccess extends ProtectedEx implements Serializable{
    public int x;
    public static void main(String[] args) throws CloneNotSupportedException {
        TestAccess testAccess = new TestAccess();
        testAccess.x = 10;
//        TestAccess testAccess1= (TestAccess) SerializableUtils.clone();
    }
}
