package com.terry.proj1;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));


    }

    public static boolean isOdd(int number) {
        if (number < 0)
            return false;
        else {
            if (number % 2 == 0)
                return false;
            else
                return true;
        }
    }

        public static int sumOdd ( int start, int end)
        {
            if (start < 0 || end < 0)
                return -1;
            else if (end < start)
                return -1;
            else {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        sum += i;
                    }
                }
                return sum;
            }
        }

}
