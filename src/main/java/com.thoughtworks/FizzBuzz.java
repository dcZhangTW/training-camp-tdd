package com.thoughtworks;

class FizzBuzz {
    static String report(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }

        if (number % 5 == 0) {
            result += "Buzz";
        }

        if (number == 7) {
            result += "Whizz";
        }
        return result;
    }
}
