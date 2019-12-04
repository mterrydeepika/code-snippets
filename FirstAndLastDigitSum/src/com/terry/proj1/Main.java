package com.terry.proj1;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-232303));
    }
    public static int sumFirstAndLastDigit(int number)
    {
        int count=0;
        int sum=0;
        int digit=0;
        if (number<0)
            return -1;
                    else
        {
            while(number>0)
            {
                digit=number%10;
                number=number/10;
if(count==0)
    sum+=digit;
    count++;
            }
            sum+=digit;
return sum;
        }
    }
}
