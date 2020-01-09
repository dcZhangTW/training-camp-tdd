package com.thoughtworks;

class FizzBuzz {
    static String fizzBuzz(int number) {
        String result = getFizz(number);
        result += getBuzz(number);
        result += getWhizz(number);
        return result;
    }

    private static boolean regardlessBuzzWhizz(int number) {
        String numberString = String.valueOf(number);
        if (numberString.contains("5")) {
            return true;
        }
        return !numberString.contains("3");
    }

    private static String getFizz(int number) {
        String numberString = String.valueOf(number);
        boolean isFizz = number % 3 == 0 || numberString.contains("3");
        boolean regardlessFizz = numberString.contains("5");
        return isFizz && !regardlessFizz ? "Fizz" : "";
    }

    private static String getBuzz(int number) {
        boolean isBuzz = number % 5 == 0;
        return isBuzz && regardlessBuzzWhizz(number) ? "Buzz" : "";
    }

    private static String getWhizz(int number) {
        boolean isWhizz = number % 7 == 0;
        return isWhizz && regardlessBuzzWhizz(number) ? "Whizz" : "";
    }
}
