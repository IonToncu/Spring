package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rockMusic")
public class Rock implements Music{
    @Autowired// Auto set this field, can be ued for method like *
    @Qualifier("returnName")
    private String name;
    @Autowired
    @Qualifier("returnAuthor")//Name of method
    private String author;

    private String otherName;

    public Rock(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public Rock(){

    }

    @Override
    public String playMusic() {
        return name;
    }
    @Autowired
    @Qualifier("returnName2")
    public void printName(String name){
       this.otherName = name;
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
                ", otherName='" + otherName + '\'' +
                '}';
    }

    @Bean
    public String returnName(){
        return  "Name";
    }
    @Bean
    public String returnName2(){
        return  "OtherName";
    }
    @Bean
    public String returnAuthor(){
        return  "Author";
    }
}
