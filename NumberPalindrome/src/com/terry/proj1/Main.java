package com.terry.proj1;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));

    }

    public static boolean isPalindrome(int number) {
        number= Math.abs(number);
       int origNumber=number;
       int reverse=0;

       do{
    int lastDigit= number%10;
           number/=10;
           reverse=reverse*10;
    reverse+=lastDigit;
        } while(number>0);

        System.out.println("origNumber: "+ origNumber);
        System.out.println("reverse: "+ reverse);

        if (origNumber == reverse)
            return true;
        else
            return false;

    }
    /*public static int getDigit(int number)
    {
        int digit= number%10;
        System.out.println("digit: "+digit);
        System.out.println("number: "+number);
        return digit;
    }*/
}