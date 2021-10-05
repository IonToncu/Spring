package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Stream;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        MusicPlayer musicPlayer = context.getBean("Player", MusicPlayer.class);
//        System.out.println(musicPlayer);
        Rock rock1 = context.getBean("rockMusic", Rock.class);
        Rock rock2 = context.getBean("rockMusic", Rock.class);

        Classic classic1 =context.getBean("classicMusic", Classic.class);
        Classic classic2 =context.getBean("classicMusic", Classic.class);

        rock1.setName("Pain");
        classic1.setName("sonata nr3");

        System.out.println(rock1);//prototype
        System.out.println(rock2);//prototype
        System.out.println(classic1);//singleton
        System.out.println(classic2);//singleton

        context.close();
    }
}
