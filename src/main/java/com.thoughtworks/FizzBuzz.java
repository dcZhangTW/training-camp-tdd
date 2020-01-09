package com.thoughtworks;

class FizzBuzz {
    static String fizzBuzz(int number) {
        String result = getFizz(number);
        result += getBuzz(number);
        result += getWhizz(number);
        return result;
    }

    private static String getFizz(int number) {
        boolean isFizz = number % 3 == 0 || String.valueOf(number).contains("3");
        return isFizz ? "Fizz" : "";
    }

    private static String getBuzz(int number) {
        boolean isBuzz = number % 5 == 0;
        boolean regardlessBuzz = String.valueOf(number).contains("3");
        return isBuzz && !regardlessBuzz ? "Buzz" : "";
    }

    private static String getWhizz(int number) {
        return number % 7 == 0 ? "Whizz" : "";
    }
}
