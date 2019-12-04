package com.terry.proj1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int [] arr)
    {
        int temp=0;
        int maxIndex=arr.length-1;
        int halfIndex=maxIndex/2;
for(int i=0;i<halfIndex;i++)
{
    temp=arr[i];
    arr[i]=arr[maxIndex-i];
    arr[maxIndex-i]=temp;
}
    }
}
