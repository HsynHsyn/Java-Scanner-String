package Muhtar_SDET.Day12_Custom_Methods_Intro;

import java.util.Locale;

public class Task7_MonthNumber {
    public static void main(String[] args) {

        month("march");
        month("April");
    }
    public static void month(String month) {
        month = month.toLowerCase();
        if (month.equals("march")|| month.equals("may")|| month.equals("july")|| month.equals("september") || month.equals("october")|| month.equals("july")){
            System.out.println(month + " has 31 days");
        } else if (month.equals("april")|| month.equals("july")|| month.equals("september") || month.equals("november")) {
            System.out.println(month + " has 30 days");
        } else {
            System.out.println(month + " has 28 days");
        }
    }

}

/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */