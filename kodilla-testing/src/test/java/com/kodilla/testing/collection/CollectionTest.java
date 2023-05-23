package com.kodilla.testing.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class CollectionTest {

    public CollectionTest(Assertions anAssert) {
    }

    @DisplayName("Class behaves correctly when the list is empty")

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given

        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        OddNumbersExterminator oddNumbersExterminator = null;
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }
    @DisplayName("class behaves correctly when the list contains even and odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(5);
        normalList.add(2);
        normalList.add(1);
        normalList.add(4);
        normalList.add(10);

        ArrayList<Integer>expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(2);
        expectedResultList.add(4);
        expectedResultList.add(10);
        //When
        OddNumbersExterminator oddNumbersExterminator = null;
        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }
}