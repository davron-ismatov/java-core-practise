package org.example.javacoreandspringpractise.collectionFrmwrk;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx{


    static class A implements Comparator<A>{
        int x;
        int y;

        public A(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compare(A o1, A o2) {
            return o1.x-o2.x;
        }
    }
    public static void main(String[] args) {
        SortedSet<A> a = new TreeSet<>();
        a.add(new A(1,2));
    }
}
