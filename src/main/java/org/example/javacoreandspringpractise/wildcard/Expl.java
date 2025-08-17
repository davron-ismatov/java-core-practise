package org.example.javacoreandspringpractise.wildcard;

import java.util.List;

public class Expl<F,V> {
    static class A{
        private int a ;
        public void foo(){
            System.out.println("A");
        }
    }
    static class B extends A{
        private int b;
    }
    static class C extends B{
        private int c;
    }

    public  static <T> void v(List<? extends A> A){
        A.get(0).foo();
        System.out.println("Something");
    }



    public static void main(String[] args) {
        List<A> a = List.of(new A());
        List<B> b = List.of(new B());
        List<C> c = List.of(new C());
        v(a);
        v(b);
        v(c);
    }
}
