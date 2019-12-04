package com.terry.proj1;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));

    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;
        else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
                else
                    return false;

            } else
                return true;
        } else
            return false;
    }

    public static int getDaysInMonth(int month, int year)
    {
if (month <1 || month>12)
    return -1;
else if(year <1 || year>9999)
    return -1;
else
{
        if(isLeapYear(year)) {
            if (month == 2) {
                int days = 29;
                return days;
            }
        }

        switch(month)
        {
            case 1:
                return 31;
            //break;

            case 2:
                return 28;
           // break;
            case 3:
                return 31;
           // break;
            case 4:
                return 30;
            //break;
            case 5:
                return 31;
            //break;
            case 6:
                return 30;
            //break;
            case 7:
                return 31;
           // break;
            case 8:
                return 31;
           // break;
            case 9:
                return 30;
          // break;
            case 10:
                return 31;
           // break;
            case 11:
                return 30;
           // break;
            case 12:
                return 31;
           // break;

        }

    }
return -1;
}
    }

