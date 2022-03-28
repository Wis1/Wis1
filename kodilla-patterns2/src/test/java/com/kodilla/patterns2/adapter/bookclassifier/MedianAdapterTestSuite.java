package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void testPublicationYearMedianTest(){
        //Given
        Book book1= new Book("paul", "Java8", 1995, "09iko");
        Book book2= new Book("chris", "Java11", 2001, "11iko");
        Book book3= new Book("ted", "Java17", 2011, "17iko");
        Book book4= new Book("bob", "Java21", 2023, "23iko");
        Book book5= new Book("kate", "Java23", 2025, "25iko");

        Set<Book> booksTestSet= new HashSet<>();
        booksTestSet.add(book1);
        booksTestSet.add(book2);
        booksTestSet.add(book3);
        booksTestSet.add(book4);
        booksTestSet.add(book5);

        MedianAdapter medianAdapter=new MedianAdapter();

        //When
        int publicationYearMedianTest= medianAdapter.publicationYearMedian(booksTestSet);

        // Then
        assertEquals(2011, publicationYearMedianTest);
    }
}
