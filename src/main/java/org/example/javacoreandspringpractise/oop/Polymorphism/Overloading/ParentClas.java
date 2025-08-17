package org.example.javacoreandspringpractise.oop.Polymorphism.Overloading;

public class ParentClas {
    private String name;

    public ParentClas(String davron) {
        this.name = davron;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ParentClas() {
    }

    public final void method(Integer i){
        System.out.println("Parent class method with");
    }
    public final void method(Double i){
        System.out.println("Parent class method with");
    }


    public static void main(String[] args) {
        ParentClas parentClas = new ParentClas("Davron");
        ParentClas parentClas1 = parentClas;
        parentClas1.setName("ass");
        System.out.println(parentClas.getName());
        System.out.println(parentClas.equals(parentClas1));
        System.out.println(parentClas==parentClas1);
    }
}
