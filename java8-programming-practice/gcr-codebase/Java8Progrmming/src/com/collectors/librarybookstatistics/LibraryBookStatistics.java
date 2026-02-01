package com.collectors.librarybookstatistics;
import java.util.*;
import java.util.stream.Collectors;

class Book {
    private String title;
    private String genre;
    private int pages;

    Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}
public class LibraryBookStatistics {
	  public static void main(String[] args) {

	        List<Book> books = Arrays.asList(
	                new Book("Book A", "Fiction", 300),
	                new Book("Book B", "Fiction", 450),
	                new Book("Book C", "Science", 500),
	                new Book("Book D", "Science", 350),
	                new Book("Book E", "History", 600)
	        );

	        Map<String, IntSummaryStatistics> statsByGenre =
	                books.stream()
	                        .collect(Collectors.groupingBy(
	                                Book::getGenre,
	                                Collectors.summarizingInt(Book::getPages)
	                        ));

	        statsByGenre.forEach((genre, stats) -> {
	            System.out.println("Genre: " + genre);
	            System.out.println("Total pages: " + stats.getSum());
	            System.out.println("Average pages: " + stats.getAverage());
	            System.out.println("Max pages: " + stats.getMax());
	            System.out.println();
	        });
	  }
}
