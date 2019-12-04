package com.terry.proj1;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
           }
public static boolean hasSharedDigit(int number1, int number2)
{
    int digit1=0;
    int digit2=0;
    if (number1<10 || number1>99 || number2<10 || number2>99)
    {
        return false;
    }
    else
    {
        for(number1=number1; number1>0; number1/=10) {
            digit1 = number1 % 10;

            for (int num2 = number2; num2 > 0; num2 /= 10) {
                digit2 = num2 % 10;
                System.out.println("digit1:" + digit1);
                System.out.println("digit2:" + digit2);
                if (digit1 == digit2) {
                    return true;
                }
            }
        }
        return false;
    }
}
}

/*for(number1=number1; number1>0; number1/=10) {
        digit1 = number1 % 10;

        for (int num2 = number2; num2 > 0; num2 /= 10) {
        digit2 = num2 % 10;
        System.out.println("digit1:" + digit1);
        System.out.println("digit2:" + digit2);
        if (digit1 == digit2) {
        return true;
        }
        }
        }*/


/*
else
        {
        do
        {
        digit1=number1%10;
        do {
        digit2=number2%10;
        System.out.println("digit1:" + digit1);
        System.out.println("digit2:" + digit2);
        if (digit1==digit2) {
        return true;
        }
        number2=number2/10;
        } while(number2>0);
        number1=number1/10;
        } while(number1>0);
        return false;
        }*/
