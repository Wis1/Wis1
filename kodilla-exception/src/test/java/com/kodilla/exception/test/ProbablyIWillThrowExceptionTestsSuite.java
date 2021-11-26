package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbablyIWillThrowExceptionTestsSuite {

    @Test
    void testProbablyIWillThrowExceptionWithDifferentValues () throws Exception {
        //Given
        SecondChallenge secondChallenge= new SecondChallenge();
        String text=secondChallenge.probablyIWillThrowException(1,0);

        //When & Then
        assertAll(
                ()->assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(2,1)),
                ()->assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(0,1)),
                ()->assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(1,1.5)),
                ()->assertDoesNotThrow(()-> secondChallenge.probablyIWillThrowException(1,1)),
                ()->assertEquals("Done!", text)
        );
    }
}
