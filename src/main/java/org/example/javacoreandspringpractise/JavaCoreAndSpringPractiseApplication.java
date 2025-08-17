package org.example.javacoreandspringpractise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.lang.annotation.Documented;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Consumer;

@SpringBootApplication
public class JavaCoreAndSpringPractiseApplication {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        class Clone extends Object{
            private int x;

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }
        }





        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                return;
            }
        };
        SpringApplication.run(JavaCoreAndSpringPractiseApplication.class, args);
    }

}
