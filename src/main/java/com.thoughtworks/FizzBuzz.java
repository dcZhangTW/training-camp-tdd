package com.thoughtworks;

class FizzBuzz {
    static String report(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number == 5) {
            return "Buzz";
        } else if (number == 7) {
            return "Whizz";
        }
        return "";
    }
}
