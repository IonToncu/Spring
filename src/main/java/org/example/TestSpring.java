package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Stream;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Classic classic1 = context.getBean("classicMusic", Classic.class);
        Classic classic2 = context.getBean("classicMusic", Classic.class);
        classic1.setName("Noodles");
        System.out.println(classic1);
        System.out.println(classic2);

        context.close();
    }
}
