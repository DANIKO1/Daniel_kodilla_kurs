package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User adam = new Millenials("Adam Mickiewicz");
        User piotr = new YGeneration("Piotr Kozłowski");
        User max = new ZGeneration("Max Maxinski");

        //When
        String adamShouldShare = adam.sharePost();
        System.out.println("Adam should share on: " + adamShouldShare);
        String piotrShouldShare = piotr.sharePost();
        System.out.println("Piotr should share on: " + piotrShouldShare);
        String maxShouldShare = max.sharePost();
        System.out.println("Max should share on: " + maxShouldShare);

        //Then
        assertEquals("Facebook", adamShouldShare);
        assertEquals("Twitter", piotrShouldShare);
        assertEquals("Snapchat", maxShouldShare);
    }

    @Test
    void testIndividualSharingStrategies() {

        //Given
        User adam = new Millenials("Adam Mickiewicz");

        //When
        String adamShouldShare = adam.sharePost();
        System.out.println("Adam should share on: " + adamShouldShare);
        adam.setSocialPublisher(new SnapchatPublisher());
        adamShouldShare = adam.sharePost();
        System.out.println("Adam now should share on: " + adamShouldShare);

        //Then
        assertEquals("Snapchat", adamShouldShare);
    }
}