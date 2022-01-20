package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Book book1= new Book("Title1","Author1", LocalDate.of(1950,10,30));
        Book book2= new Book("Title2", "Author2", LocalDate.of(2005,5,13));
        Book book3= new Book("Title3", "Author3", LocalDate.of(2007, 5,12));
        Book book4= new Book("Title4", "Author4", LocalDate.of(2012, 11, 9));

        Library library= new Library("library1");
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);

        Library clonedLibrary= null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary= null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepCloneLibrary.getBooks());
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(4, deepCloneLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());
    }
}
