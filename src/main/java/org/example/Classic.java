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

    @Override
    public String toString() {
        return "Classic{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
