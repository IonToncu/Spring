package org.example;

public class Rock implements Music{
    private String name;
    private String author;

    public Rock(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String playMusic() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rock{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
