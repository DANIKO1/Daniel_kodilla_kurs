package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();
        int a = 50;
        int b = 30;
        int result1 = calculator.add(a, b);
        if (result1 == 80)
        {
                System.out.println("test add OK");
            } else{
                System.out.println("test add Error!");
            }
        Calculator calculator1 = new Calculator();
        int result2 = calculator1.subtract(a, b);
        if (result2 == 20)
        {
            System.out.println("test subtract OK");
        } else{
            System.out.println("test subtract Error!");
        }
    }
}