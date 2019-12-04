package com.terry.proj1;

public class Main {
    private  final String INVALID_VALUE_MESSAGE = "Invalid value";

    //static String s;
    public static void main(String[] args) {

Main main= new Main();
        System.out.println(main.getDurationString(65, 5));
        System.out.println(main.getDurationString(3905));


    }

    public  String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59))
            return INVALID_VALUE_MESSAGE;
        else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = hours + "h";

            if (hours<10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = remainingMinutes + "m";
            if (remainingMinutes<10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds<10)
                secondsString = "0" + secondsString;
            return hoursString + " " + minutesString + " " + secondsString + "";

        }
    }

    public  String getDurationString(int seconds) {
        if (seconds < 0)
            return "Invalid value";
        else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes,remainingSeconds);
        }

    }
}
