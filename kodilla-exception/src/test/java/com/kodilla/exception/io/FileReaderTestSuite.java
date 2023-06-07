package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Task 8.3")
public class FileReaderTestSuite {
    @Test
    void testSecondChallenge() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & then
        assertAll(

                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 0)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5))
        );
    }
}