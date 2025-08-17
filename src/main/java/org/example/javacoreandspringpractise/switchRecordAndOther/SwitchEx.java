package org.example.javacoreandspringpractise.switchRecordAndOther;

import java.security.Principal;

public class SwitchEx {
    static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Person person = new Person("AD", 12);
        Integer i =0;

        switch (i){
            case 0:
                i++;
            case 1:
                i++;
        }
        System.out.println(i);

        Person person1 = switch (i){
            case 0 : yield  person;

            default : throw new IllegalStateException("Unexpected value: " + i);
        };
    }
}
