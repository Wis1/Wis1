package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User max= new Millenials("Max");
        User kate= new YGeneration("Kate");
        User ben= new ZGeneration("Ben");

        //When
        String publisherMax= max.sharePost();
        System.out.println("Max: "+publisherMax);
        String publisherKate= kate.sharePost();
        System.out.println("Kate: "+publisherKate);
        String publisherBen= ben.sharePost();
        System.out.println("Ben: "+publisherBen);

        //Then
        assertEquals("He/She uses Facebook", publisherMax);
        assertEquals("He/She uses Twitter", publisherKate);
        assertEquals("He/She uses Snapchat", publisherBen);
        System.out.println();
    }


    @Test
    void testIndividualSharingStrategy(){
        //Given
        User ben= new ZGeneration("Ben");

        //When
        String publisherBen= ben.sharePost();
        System.out.println("Ben: "+publisherBen);
        ben.setSocialPublisher(new TwitterPublisher());
        publisherBen=ben.sharePost();
        System.out.println("Ben: "+publisherBen);

        //Then
        assertEquals("He/She uses Twitter", publisherBen);

    }
}
