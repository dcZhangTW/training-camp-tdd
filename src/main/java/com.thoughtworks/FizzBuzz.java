package com.thoughtworks;

class FizzBuzz {
    static String report(int number) {
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
        return number % 5 == 0 ? "Buzz" : "";
    }

    private static String getWhizz(int number) {
        return number % 7 == 0 ? "Whizz" : "";
    }
}
