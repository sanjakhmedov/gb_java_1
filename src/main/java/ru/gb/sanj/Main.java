package ru.gb.sanj;

//THIS PACKAGE IS FOR HOMEWORKS

public class Main {

    public static void main(String[] args) {
        System.out.println(leapYear(2000));
    }

    public static boolean leapYear(int year) {

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}