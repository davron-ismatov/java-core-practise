package org.example.javacoreandspringpractise.switchRecordAndOther;

public class PatternMatching {
    public static void main(String[] args) {
        Number number = Integer.valueOf(10);
        if (number instanceof Integer i) {
            number = 12;
            System.out.println(number);
        } else if (number instanceof Double d) {
            System.out.println(d);
        }
    }
}
