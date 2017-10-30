package com.kodilla.kodilla;

public class Book {

    private String title;
    private String author;
    private Integer printedYear;

    public Book (String title, String author, Integer printedYear)
    {
        this.title = title;
        this.author = author;
        this.printedYear = printedYear;
    }

    public int hasCode()
    {
        return this.printedYear;
    }

    public boolean equals (Object o)
    {
        final Book e = (Book) o;
        return this.title.equals(e.getTitle()) && this.author.equals(e.getAuthor()) && this.printedYear.equals(e.getPrintedYear());
    }

    public String toString()
    {
        return title + ", " + author + ", printed year: " + printedYear;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public Integer getPrintedYear()
    {
        return this.printedYear;
    }

}
