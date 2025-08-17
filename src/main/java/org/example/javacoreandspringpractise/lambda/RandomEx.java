package org.example.javacoreandspringpractise.lambda;

import java.util.List;
import java.util.WeakHashMap;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class RandomEx {
    public  static <T> T s(Random<T> stringRandom,T s){
        return      stringRandom.random(s);
    }

    public static int compare(String s,String a){
        return s.compareTo(a);
    }

    public static void main(String[] args) {
        int x =0;
//        Random<Double> random = (a) -> Math.random() * a;
//        System.out.println(random.random(23.24));
        Random<Double> a  = (b) -> {


            return (double) (x/2);
        };

        List<String> list = List.of("a","b","c");

        System.out.println(list.stream().max(RandomEx::compare).orElseThrow());
//        System.out.println(s((Integer i)-> i/2, 12));
    }
}
