package com.terry.proj1;
// using the for statement, call the calculateInterest method with
// the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
// and print the results to the console window.

// How would you modify the for loop above to do the same thing as
// shown but to start from 8% and work back to 2%


// Create a for statement using any range of numbers
// Determine if the number is a prime number using the isPrime method
// if it is a prime number, print it out AND increment a count of the
// number of prime numbers found
// if that count is 3 exit the for loop
// hint:  Use the break; statement to exit
public class Main {

    public static void main(String[] args) {
	for(int rate=2;rate<=8;rate++)
        {
          double interest=calculateInterest(1000,rate);
            System.out.println("Interest : "+ interest+ " for rate "+rate +"  " + String.format("%.3f",calculateInterest(10000.0, rate)));
        }

        for(int rate=8;rate>=2;rate--)
        {
            double interest= calculateInterest(1000,rate);
            System.out.println("Interest : "+ interest+ " for rate "+rate+"  " + String.format("%.3f",calculateInterest(10000.0, rate)));
        }
        int count=0;
        for(int i=1;i<=20;i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("i " + i);
                System.out.println("count " + count);
                if (count == 3)
                break;
            }
        }
    }


    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
