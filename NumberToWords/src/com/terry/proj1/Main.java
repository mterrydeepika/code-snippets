package com.terry.proj1;

public class Main {

    public static void main(String[] args) {
        numberToWords(900);
        //System.out.println(getDigitCount(0));

      //  System.out.println(reverse(0));
    }

    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");

        //System.out.println(number);
        int origCount = getDigitCount(number);
        // System.out.println(origCount);


        number = reverse(number);
        //System.out.println(number);
        int revCount = getDigitCount(number);
        //System.out.println(revCount);



        do {
            int num = number % 10;

            switch (num) {
                case 0:
                    System.out.print("Zero"+" ");
                    break;
                case 1:
                    System.out.print("One"+" ");
                    break;
                case 2:
                    System.out.print("Two"+" ");
                    break;
                case 3:
                    System.out.print("Three"+" ");
                    break;
                case 4:
                    System.out.print("Four"+" ");
                    break;
                case 5:
                    System.out.print("Five"+" ");
                    break;
                case 6:
                    System.out.print("Six"+" ");
                    break;
                case 7:
                    System.out.print("Seven"+" ");
                    break;
                case 8:
                    System.out.print("Eight"+" ");
                    break;
                case 9:
                    System.out.print("Nine"+" ");
                    break;
                case 10:
                    System.out.print("Ten"+" ");
                    break;
            }
            number /= 10;
        }while(number > 0);

            if (origCount!=revCount) {
                for (int i = 1; i <= origCount-revCount;i++)
                    System.out.print("Zero"+" ");
            }
        }


    public static int reverse( int n){
        int number = Math.abs(n);
        int digit = 0;
        int num = 0;
        while (number > 0) {
            num *= 10;
            digit = number % 10;
            num += digit;
            number /= 10;
            // System.out.println("digit"+digit);
            //System.out.println("number"+ number);
            //System.out.println("num"+ num);

        }
        //System.out.println("num"+ num);
        if (n < 0)
            num = -num;
        return num;
    }
//number=86  num=0 digit=6 num=6 number=8  num=60 digit=8 num=68 number<0

    public static int getDigitCount( int number) {
        int count = 0;
        if (number < 0)
            return -1;
        do {
                count++;
                number /= 10;
            } while (number>0);
        return count;
    }
    }

