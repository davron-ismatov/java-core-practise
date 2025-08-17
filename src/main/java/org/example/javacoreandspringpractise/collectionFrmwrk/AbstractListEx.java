package org.example.javacoreandspringpractise.collectionFrmwrk;

import java.util.AbstractList;
import java.util.AbstractSequentialList;

public class AbstractListEx extends AbstractList<Integer> {
    private int size;

    public AbstractListEx(int size) {
        this.size = size;
    }

    @Override
    public Integer get(int index) {
        return index;
    }

    @Override
    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        AbstractListEx a = new AbstractListEx(6);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
