package com.thoughtworks;

class FizzBuzz {
    static String fizzBuzz(int number) {
        String result = getFizz(number);
        result += getBuzz(number);
        result += getWhizz(number);
        return result.equals("") ? String.valueOf(number) : result;
    }

    private static boolean regardlessBuzzWhizz(int number) {
        String numberString = String.valueOf(number);
        if (numberString.contains("5")) {
            return false;
        }
        return numberString.contains("3");
    }

    private static boolean regardlessBuzz(int number) {
        if (String.valueOf(number).contains("7")) {
            return true;
        }
        return regardlessBuzzWhizz(number);
    }

    private static boolean regardlessFizz(int number) {
        String numberString = String.valueOf(number);
        return numberString.contains("5") && !numberString.contains("7");
    }

    private static String getFizz(int number) {
        String numberString = String.valueOf(number);
        boolean isFizz = number % 3 == 0 || numberString.contains("3");
        return isFizz && !regardlessFizz(number) ? "Fizz" : "";
    }

    private static String getBuzz(int number) {
        boolean isBuzz = number % 5 == 0;
        return isBuzz && !regardlessBuzz(number) ? "Buzz" : "";
    }

    private static String getWhizz(int number) {
        boolean isWhizz = number % 7 == 0;
        return isWhizz && !regardlessBuzzWhizz(number) ? "Whizz" : "";
    }

    public static void main(String[] args) {
        for( int i = 0; i < 120; i++) {
            String result = fizzBuzz(i+1);
            System.out.println(result);
        }
    }
}
