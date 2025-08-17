package org.example.javacoreandspringpractise.switchRecordAndOther;



public record Person(String name, Integer age) {
    public  String name()  {
        return name;
    }

    @Override
    public Integer age() {
        return age;
    }

    public Person {
        name = name.toUpperCase();
        age = age + 1;

    }

    public Person(String a) {
        this(a, 0);
    }
}
