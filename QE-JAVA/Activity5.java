package com.example;
abstract class Book {
    String title;
    abstract void setTitle(String title);
    abstract String getTitle();
}
class Mybook extends Book {
    void setTitle(String title) {
        this.title = title;
    }
    String getTitle() {
        return title;
    }
}

public class Activity5 {
    public static void main(String[] args) {
        Mybook newNovel=new Mybook();
        newNovel.setTitle("Song of ice and fire");
        System.out.println(newNovel.getTitle());
    }
}
