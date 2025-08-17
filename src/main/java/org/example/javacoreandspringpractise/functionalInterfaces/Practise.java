package org.example.javacoreandspringpractise.functionalInterfaces;

import java.util.function.*;

public class Practise {
    public static void main(String[] args) {
        Function<String,String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return "";
            }
        };

        BiFunction<String,String,String> biFunction = new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return "";
            }
        };

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };

        BiPredicate<String,String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return false;
            }
        };

        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "";
            }
        };

        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };

        BiConsumer<String,Integer> consumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {

            }
        };
    }
}
