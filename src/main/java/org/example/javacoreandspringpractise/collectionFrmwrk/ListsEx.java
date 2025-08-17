package org.example.javacoreandspringpractise.collectionFrmwrk;

import java.util.*;

public class ListsEx {
     static class Movie  {
        private String name;
        private int rating;
        private int year;

        public Movie(String name, int rating, int year) {
            this.name = name;
            this.rating = rating;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public int getRating() {
            return rating;
        }

        public int getYear() {
            return year;
        }



     }

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < 10; i++) {
//            stack.push(i);
//        }
//        System.out.println(stack.peek());

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
//        Set<Integer> set = Set.of(1,2,3,4,5,6,7);
//
//
//        AbstractList<Integer> a = new ArrayList<>();
//
//        a.addAll(list);
//        a.addAll(List.copyOf(set));
//
//        for (int i = 0; i < a.size(); i++) {
//            System.out.println(a.get(i));
//        }


//        AbstractSequentialList<Integer> a = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            a.add(i);
//        }
//        System.out.println(a.size());
//
//        LinkedList<Integer> l = new LinkedList<>();
//
//        for (int i = 0; i < 10; i++) {
//            l.add(i);
//        }
        Comparator<Movie> comparator =new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.year - o2.year;
            }
        };

        Set<Movie> a = new TreeSet<>(comparator);
    a.add(new Movie("a", 1, 1990));
    a.add(new Movie("b", 2, 1991));
    a.add(new Movie("c", 3, 1992));
        for (Movie movie : a) {
            System.out.println(movie.getName());
        }



    }
}
