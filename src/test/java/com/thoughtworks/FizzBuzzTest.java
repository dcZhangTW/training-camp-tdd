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
}
