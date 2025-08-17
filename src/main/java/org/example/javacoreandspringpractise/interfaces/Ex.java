package org.example.javacoreandspringpractise.interfaces;

import java.util.AbstractList;

public non-sealed class Ex extends  Second implements SealdEx{



    public static void main(String[] args) {

        Second f = new Ex();
        f.h();

    }

    @Override
    public void hello() {
        System.out.println("class");
    }
    @Override
    public void h() {
        System.out.println("class");
    }
}
