package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzWhenGiven3() {
        int number = 3;
        String result = FizzBuzz.report(number);
        Assert.assertEquals(result, "Fizz");
    }

    @Test
    public void shouldReturnBuzzWhenGiven5() {
        int number = 5;
        String result = FizzBuzz.report(number);
        Assert.assertEquals(result, "Buzz");
    }

    @Test
    public void shouldReturnWhizzWhenGiven7() {
        int number = 7;
        String result = FizzBuzz.report(number);
        Assert.assertEquals(result, "Whizz");
    }

    @Test
    public void shouldReturnFizzWhenGivenMultiplesOf3() {
        int number = 6;
        String result = FizzBuzz.report(number);
        Assert.assertEquals(result, "Fizz");
    }

    @Test
    public void shouldReturnBuzzWhenGivenMultiplesOf5() {
        int number = 10;
        String result = FizzBuzz.report(number);
        Assert.assertEquals(result, "Buzz");
    }
}
