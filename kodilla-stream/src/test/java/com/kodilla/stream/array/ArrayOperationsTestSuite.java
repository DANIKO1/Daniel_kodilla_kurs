package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ArrayOperationsTestSuite {
    @DisplayName("Test checks calculate with range() method and IntStream interface")
    @Test
    public void testGetAverage(){
        //Given
        int [] numbers = {1,9,4,6,3,7,5,5,10,0,3,7,5,5,9,1,2,8,5,5};
        double averageExpected = 5.0;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(averageExpected, average, 0.0001);
    }
}