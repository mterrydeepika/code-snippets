package com.terry.proj1;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
           }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second <10)
            return -1;
        else {
            //int number = first;
            int i = 0;
            int out = 0;

          /*  if (first < second)
                number = second;
*/
            for (i = 1;( i <= first && i<=second); i++) {
                if ((first % i == 0) && (second % i == 0)) {
//                    System.out.println("i :" + i);
                    out = i;
                }
            }
            return out;
        }
    }
}
