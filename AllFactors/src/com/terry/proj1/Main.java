package com.terry.proj1;

public class Main {

    public static void main(String[] args) {
        printFactors(6);    }

    public static void printFactors(int number)
    {
        if (number < 1)
            System.out.println("Invalid Value");

            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    System.out.print(i + " ");
            }

    }
}
