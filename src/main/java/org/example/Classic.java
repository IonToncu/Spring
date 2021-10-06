package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("classicMusic")
@Scope("singleton")//singleton or prototype
public class Classic implements Music{
    private String name;
    @Value("Mozart")
    private String author;

    @Override
    public String playMusic() {
        return name;
    }

    public Classic(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public Classic(){}

    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void initMethod(){// not mandatory, can take another name
        this.name = "Sonata nr 16";
        System.out.println("init method for Classic music class ");
    }
    @PreDestroy
    public void destroyMethod(){// not mandatory, can take another name
        System.out.println("Destroy method for Classic music class");
    }

    @Override
    public String toString() {
        return "Classic{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
