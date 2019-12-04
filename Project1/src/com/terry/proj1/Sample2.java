package com.terry.proj1;

public class Sample2 {

    /*public static void main(String[] args) {
        String[] stringsArray = { "hidfg", "uifgh", "cadhy", "zahuj", "uznnn"};

        // String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(stringsArray, 26, 5);

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    public static void radixSort(String[] input, int radix, int width) {
        for (int i = width-1; i >=0 ; i--) {
            radixSingleSort(input, i, radix);
        }
    }
//        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
    public static void radixSingleSort(String[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value: input) {
            countArray[getChar(position, value)]++;
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getChar(position, input[tempIndex])]] =
                    input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
        for(int k=0;k<numItems;k++)
        {
            System.out.print(" "+input[k]);
        }
        System.out.println("");

    }

//{ "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"}
    public static int getChar(int position, String value) {
        //return value / (int) Math.pow(radix, position) % radix;
        return value.charAt(position) - 'a';

    }*/
}

