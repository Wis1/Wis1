package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]

        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
                .forEach(System.out::println);                                            // [4]

    }

//        Forum theForum= new Forum();
//        LocalDate date = LocalDate.now();
//        Map<Integer, ForumUser> theResultMapOfForumUsers= theForum.getUserList().stream()
//                .filter(forumUser->forumUser.getSex()=='M')
//                .filter(forumUser -> forumUser.getDateOfBirth().getYear()<=(date.getYear()-20))
//                .filter(forumUser -> forumUser.getNumberOfPostsPublished()>0)
//                .collect(Collectors.toMap(ForumUser::getIdentifier, forumUser -> forumUser));
//
//        theResultMapOfForumUsers.entrySet().stream()
//                .map(entry->entry.getKey()+": "+ entry.getValue())
//                .forEach(System.out::println);
//    }
}
