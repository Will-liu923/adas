package com.leoLW.javasestudy.day08.ObjectOriented;

public class BookTest {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setName("Three Body");
        book1.setPageNum(150);
        book1.detail();
        book1.setPageNum(500);
        book1.detail();

        Book book2 = new Book(100);
        book2.detail();

        Book book3 = new Book();
        book3.detail();
    }
}
