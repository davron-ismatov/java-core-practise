package org.example.javacoreandspringpractise.reflectionApi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ScheduledExecutorService;

public  class StringRef {
    private  int x;

    private void smth() {
    }

    public  void setX(int x) {
        this.x = x;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
//        String[] strings = {"asd","asdas"};
//        List.of(strings).forEach(System.out::println);
        Class c = Class.forName("org.example.javacoreandspringpractise.reflectionApi.StringRef");
        c.isRecord();

//        System.out.println(c.getName());
//        for (Method declaredMethod : c.getDeclaredMethods()) {
//            System.out.println(declaredMethod.getName());
//        }
//
//        Class i = int.class;
//        System.out.println(i.getName());
//        for (Method declaredMethod : i.getDeclaredMethods()) {
//            System.out.println(declaredMethod.getName());
//        }

//        for (Field declaredField : c.getDeclaredFields()) {
//            System.out.println(declaredField.getName());
//        }
//        for (Method declaredMethod : c.getDeclaredMethods()) {
//            System.out.println(declaredMethod.getName());
//        }
//        if (c.isInstance(new StringRef())){
//            System.out.println("Yes");
//        }
//
//        Field[] fields = c.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }
//        StringRef stringRef = new StringRef();
//        fields[0].setInt(stringRef,21);
//        System.out.println(stringRef.x);


    }
}
