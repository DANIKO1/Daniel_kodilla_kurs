package com.kodilla.testing.collection;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
public class OddNumbersExterminator {
    public List<Integer> exterminate(@NotNull List<Integer> numbers){
        ArrayList<Integer>oddNumbersList = new ArrayList<>();

        for(int number : numbers){
            if(number%2==0){
                oddNumbersList.add(number);
            }
        }
        return oddNumbersList;
    }
}
