package com.terry.proj1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
        //int min=0;
      //  int max=0;
        int min=Integer.MAX_VALUE;
         int max=Integer.MIN_VALUE;
        int number=0;
       // boolean first=true;

            while(true)
            {
                System.out.println("Enter number");
                boolean valInt=scanner.hasNextInt();
            if(!valInt)
            {
                break;
            }
            number=scanner.nextInt();
            /*if(first)
            {
                first=false;
                max=number;
                min=number;
            }*/
            if (number>max)
              max=number;
            if(number<min)
                min=number;
//scanner.nextLine();
        }
            scanner.close();
        System.out.println("Max is"+max +"and Min is"+min);
    }
}
