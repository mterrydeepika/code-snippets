package com.terry.proj1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        boolean valInt=false;
        int count=1;
        Scanner scanner = new Scanner(System.in);

        while(count<=10)
{
    System.out.println("Enter number #"+count+":" );
    valInt=scanner.hasNextInt();
    if(valInt) {
        sum += scanner.nextInt();
        count++;
        /*if(count==10)
            break;
*/
    }
    else
        System.out.println("Invalid number");
    scanner.nextLine();

}

        scanner.close();
        System.out.println("Sum is :"+sum);

    }
}
