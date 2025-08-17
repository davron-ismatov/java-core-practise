package javaex.langpkg;

import java.lang.constant.Constable;
import java.util.Arrays;

public class CharExample {
    public static void main(String[] args) {
//        System.out.println(Character.digit('5', 2));
        System.out.println(Arrays.toString("a".split(",")));
        Character c= '3';
        System.out.println(Character.getDirectionality(c));

        System.out.println(c.describeConstable());

        Void unused  = void.class.cast(null);


    }
}
