package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rockMusic")
public class Rock implements Music{
    private String name;
    private String author;

    public Rock(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public Rock(){}

    @Override
    public String playMusic() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void initMethod(){// not mandatory, can take another name
        System.out.println("init method for Classic music class ");
    }
    @PreDestroy
    public void destroyMethod(){// not mandatory, can take another name
        System.out.println("Destroy method for Classic music class");
    }
    @Override
    public String toString() {
        return "Rock{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
