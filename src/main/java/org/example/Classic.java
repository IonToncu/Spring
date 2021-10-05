package org.example;

public class Classic implements Music{
    private String name;
    private String author;

    @Override
    public String playMusic() {
        return name;
    }

    public Classic(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void initMethod(){// not mandatory, can take another name
        System.out.println("init method for Classic music class ");
    }

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
