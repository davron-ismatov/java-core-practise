package org.example.javacoreandspringpractise.stringex;

public   class StringBufferEx {
    public static void main(String[] args) {
        String a = "Hello";
        StringBuilder b = new StringBuilder(" world");

        b.append(a);
        System.out.println(a+b);
    }
}
