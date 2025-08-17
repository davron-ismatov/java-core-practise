package org.example.javacoreandspringpractise.reflectionApi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.springframework.objenesis.ObjenesisHelper.newInstance;

public class MethodEx {

    static class A{
        int x;
        public void print(A a){
            a.x=20;
            System.out.println("A");
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        A a = new A();
        A a1 = newInstance(A.class);
        a.x = 10;
        Method print = a.getClass().getMethod("print", a.getClass());
        a.print(a);
//        print.invoke(a, null);
        System.out.println(a.x);
    }


}
