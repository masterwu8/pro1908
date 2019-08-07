package com.acn;

import java.util.Scanner;

public class ShowNextTenLeapYears {

    public ShowNextTenLeapYears() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Startyear: ");
        int year = scan.nextInt();
        showNextLeapYears(year);
    }

    public static void showNextLeapYears(int year) {
        boolean found = isLeapYear(year);
        int count = 1;
        while (count <= 10) {
            if (found) {
                count++;
                System.out.println(year);
            }
            found = isLeapYear(++year);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || !(year % 100 == 0) && (year % 4 == 0));
    }

}