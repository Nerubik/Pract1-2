package ru.mirea.inbo2;

import java.lang.System;
public class Book {

    private String title;
    private String genre;
    private int year;
    private String writer;

    public Book(String title, String genre, int year, String writer) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getWriter() {
        return writer;
    }

    public int getYear() {
        return year;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String toString(){
        return "Title: "+this.title+"\nGenre: "+this.genre+"\nWriter: "+this.writer+"\nYear: "+this.year;

    }
}