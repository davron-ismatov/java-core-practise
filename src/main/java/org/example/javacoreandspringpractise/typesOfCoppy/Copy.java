package org.example.javacoreandspringpractise.typesOfCoppy;

import java.util.List;

public class Copy {
    static class B{
        int j;
    }
    static class A implements Cloneable{
        int i;
        B b;

        public A(int i, B b) {
            this.i = i;
            this.b = b;
        }

        private static <T> void fooHelper(List<?> l){
            l  = List.of("something");
            System.out.println("something");
        }

        @Override
        public A clone() {
            try {

                A clone = (A) super.clone();
                // TODO: copy mutable state here, so the clone can't change the internals of the original
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }




    public static void main(String[] args) {
        A a = new A(1,new B());
        A a1 = a.clone();
        System.out.println(a.b==a1.b);

        a.fooHelper(List.of(1,2,3));
        a.fooHelper(List.of("1","2","3"));
    }
}
