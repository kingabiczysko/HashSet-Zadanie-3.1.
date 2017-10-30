package com.kodilla.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

@SpringBootApplication
public class KodillaCourseModul31Application {

	public static void main(String[] args)
	{
		SpringApplication.run(KodillaCourseModul31Application.class, args);

		Book book1 = new Book ("Klatwa zlotego smoka", "Katarzyna Stelmaszyk", 2015);
		Book book2 = new Book ("Szatan z siodmej klasy", "Kornel Makuszynski", 1975);
		Book book3 = new Book ("Babcia Rabus", "David Walliams", 2001);
		Book book4 = new Book ("Charlie i Fabryka Czekolady", "Roald Dahl", 1980);
		Book book5 = new Book ("Opowiesci z Narnii", "Clive Staples Lewis", 2012);

		HashSet<Book> bookSet = new HashSet<Book>();

		bookSet.add(book1);
		bookSet.add(book2);
		bookSet.add(book3);
		bookSet.add(book4);
		bookSet.add(book5);

		for (Book theBook:bookSet)
		{
			if(theBook.getPrintedYear() < 2010)
			{
				System.out.println(theBook);
			}
		}



	}



}
