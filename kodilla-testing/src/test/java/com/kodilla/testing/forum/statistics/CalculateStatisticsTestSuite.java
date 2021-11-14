package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
    class CalculateStatisticsTestSuite {

    private static int testCounter= 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #"+ testCounter);
    }

    @Mock
    private Statistics statisticsMock;
    @Test
    void calculateAdvStatisticsZeroUsers(){
        //Given
        CountStatistics countStatistics= new CountStatistics(statisticsMock);
        List<String> users=new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        int posts=0;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments=0;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        List<String> theListOFUsers= statisticsMock.usersNames();
        int numberOfPosts=statisticsMock.postsCount();
        int numberOfComments= statisticsMock.commentsCount();
        //Then
        assertEquals(0,theListOFUsers.size());
        assertEquals(0,numberOfPosts);
    }

    private List<String> generateListOfNBooks(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            resultList.add("Users"+n);
        }
        return resultList;
    }
    @Test
    void calculateAdvStatisticsHundredsUsers(){
        //Given
        CountStatistics countStatistics= new CountStatistics(statisticsMock);
        List<String> listOfUsers=generateListOfNBooks(100);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        int posts=100;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments= 1000;
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When
        List<String> theListOFUsers= statisticsMock.usersNames();
        int numberOfPosts=statisticsMock.postsCount();
        int numberOfComments= statisticsMock.commentsCount();
        //Then
        assertEquals(1,numberOfPosts/theListOFUsers.size());
        assertEquals(10, numberOfComments/theListOFUsers.size());
        assertEquals(10, numberOfComments/numberOfPosts);
    }
    @Test
    void calculateAdvStatisticsZeroPosts(){
        //Given
        CountStatistics countStatistics= new CountStatistics(statisticsMock);
        int posts=0;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments=0;
        when(statisticsMock.commentsCount()).thenReturn(comments);
        List<String> listOfUsers=generateListOfNBooks(100);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        List<String> theListOFUsers=statisticsMock.usersNames();
        int numberOfPosts=statisticsMock.postsCount();
        int numberOfComments= statisticsMock.commentsCount();

        //Then
        assertEquals(0,numberOfPosts/theListOFUsers.size());
        assertEquals(0,numberOfComments/theListOFUsers.size());
        assertEquals(0,numberOfPosts);
    }
    @Test
    void calculateAdvStatisticsThousandPosts(){
        //Given
        CountStatistics countStatistics= new CountStatistics(statisticsMock);
        int posts=1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments=1000;
        when(statisticsMock.commentsCount()).thenReturn(comments);
        List<String> listOfUsers=generateListOfNBooks(100);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        List<String> theListOFUsers=statisticsMock.usersNames();
        int numberOfPosts=statisticsMock.postsCount();
        int numberOfComments= statisticsMock.commentsCount();

        //Then
        assertEquals(10,numberOfPosts/theListOFUsers.size());
        assertEquals(10,numberOfComments/theListOFUsers.size());
        assertEquals(1,numberOfComments/numberOfPosts);
    }
    @Test
    void calculateAdvStatisticsZeroComments(){
        //Given
        CountStatistics countStatistics= new CountStatistics(statisticsMock);
        int posts=1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments=0;
        when(statisticsMock.commentsCount()).thenReturn(comments);
        List<String> listOfUsers=generateListOfNBooks(100);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        List<String> theListOFUsers=statisticsMock.usersNames();
        int numberOfPosts=statisticsMock.postsCount();
        int numberOfComments= statisticsMock.commentsCount();

        //Then
        assertEquals(10,numberOfPosts/theListOFUsers.size());
        assertEquals(0,numberOfComments/theListOFUsers.size());
        assertEquals(0,numberOfComments/numberOfPosts);
    }

    @Test
    void calculateAdvStatisticsCommentsMoreThanPosts(){
        //Given
        CountStatistics countStatistics= new CountStatistics(statisticsMock);
        int comments=400;
        when(statisticsMock.commentsCount()).thenReturn(comments);
        int posts=200;
        when(statisticsMock.postsCount()).thenReturn(posts);
        List<String> listOfUsers=generateListOfNBooks(400);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        List<String> theListOFUsers=statisticsMock.usersNames();
        int numberOfPosts=statisticsMock.postsCount();
        int numberOfComments= statisticsMock.commentsCount();

        //Then
        assertEquals(0,numberOfPosts/theListOFUsers.size());
        assertEquals(1,numberOfComments/theListOFUsers.size());
        assertEquals(2,numberOfComments/numberOfPosts);
    }

}
