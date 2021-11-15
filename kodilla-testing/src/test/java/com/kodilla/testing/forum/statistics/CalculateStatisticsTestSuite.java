package com.kodilla.testing.forum.statistics;

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
        CountStatistics countStatistics= new CountStatistics();
        List<String> users=new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        int posts=0;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments=0;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        countStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0,countStatistics.getAverageCommentsPerUser());
        assertEquals(0,countStatistics.getAveragePostsPerUser());
        assertEquals(0,countStatistics.getAverageCommentsPerPost());
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
        CountStatistics countStatistics= new CountStatistics();
        List<String> listOfUsers=generateListOfNBooks(100);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        int posts=100;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments= 1000;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        countStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10,countStatistics.getAverageCommentsPerUser());
        assertEquals(1,countStatistics.getAveragePostsPerUser());
        assertEquals(10,countStatistics.getAverageCommentsPerPost());
    }
    @Test
    void calculateAdvStatisticsZeroPosts(){
        //Given
        CountStatistics countStatistics= new CountStatistics();
        int posts=0;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments=0;
        when(statisticsMock.commentsCount()).thenReturn(comments);
        List<String> listOfUsers=generateListOfNBooks(100);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        countStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0,countStatistics.getAverageCommentsPerUser());
        assertEquals(0,countStatistics.getAveragePostsPerUser());
        assertEquals(0,countStatistics.getAverageCommentsPerPost());
    }
    @Test
    void calculateAdvStatisticsThousandPosts(){
        //Given
        CountStatistics countStatistics= new CountStatistics();
        int posts=1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments=1000;
        when(statisticsMock.commentsCount()).thenReturn(comments);
        List<String> listOfUsers=generateListOfNBooks(100);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        countStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10,countStatistics.getAverageCommentsPerUser());
        assertEquals(10,countStatistics.getAveragePostsPerUser());
        assertEquals(1,countStatistics.getAverageCommentsPerPost());
    }
    @Test
    void calculateAdvStatisticsZeroComments(){
        //Given
        CountStatistics countStatistics= new CountStatistics();
        int posts=1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments=0;
        when(statisticsMock.commentsCount()).thenReturn(comments);
        List<String> listOfUsers=generateListOfNBooks(100);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        countStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0,countStatistics.getAverageCommentsPerUser());
        assertEquals(10,countStatistics.getAveragePostsPerUser());
        assertEquals(0,countStatistics.getAverageCommentsPerPost());
    }

    @Test
    void calculateAdvStatisticsCommentsMoreThanPosts() {
        //Given
        CountStatistics countStatistics = new CountStatistics();
        int comments = 400;
        when(statisticsMock.commentsCount()).thenReturn(comments);
        int posts = 200;
        when(statisticsMock.postsCount()).thenReturn(posts);
        List<String> listOfUsers = generateListOfNBooks(400);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        countStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, countStatistics.getAverageCommentsPerUser());
        assertEquals(0, countStatistics.getAveragePostsPerUser());
        assertEquals(2, countStatistics.getAverageCommentsPerPost());
    }
}
