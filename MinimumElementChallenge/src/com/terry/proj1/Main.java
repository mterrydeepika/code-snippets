package com.terry.proj1;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the count : \r");
       int count= scanner.nextInt();
int[] arr= readIntegers(count);
        System.out.println(findMin(arr));
    }

    public static int[] readIntegers(int count)
    {
        int[] array = new int[count];
        System.out.println("Please enter "+ count+ " numbers");
        for(int i=0;i<count;i++)
        {
            array[i]=scanner.nextInt();
        }
return array;
    }

    public  static int findMin(int[] ar){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            int val=ar[i];
            if(val<min)
                min=val;
        }

return min;
    }
}
