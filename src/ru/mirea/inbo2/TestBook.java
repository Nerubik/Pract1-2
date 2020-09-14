package ru.mirea.inbo2;

import java.lang.System;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("Ball", "Comedy", 2020, "Tolstoy");
        b1.setYear(1888);
        System.out.println(b1);
    }
}