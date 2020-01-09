package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzWhenGiven3() {
        int number = 3;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenGiven5() {
        int number = 5;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnWhizzWhenGiven7() {
        int number = 7;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("Whizz", result);
    }

    @Test
    public void shouldReturnFizzWhenGivenMultiplesOf3() {
        int number = 6;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenGivenMultiplesOf5() {
        int number = 10;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenGivenMultiplesOf3And5() {
        int number = 60;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhizzWhenGivenMultiplesOf3And5And7() {
        int number = 3 * 5 * 7 * 2;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("FizzBuzzWhizz", result);
    }

    @Test
    public void shouldReturnFizzWhenInclude3() {
        int number = 13;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void shouldOnlyReturnFizzWhenInclude3() {
        int number = 30;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void shouldNotReturnFizzWhenInclude5() {
        int number = 35;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("BuzzWhizz", result);
    }
}
