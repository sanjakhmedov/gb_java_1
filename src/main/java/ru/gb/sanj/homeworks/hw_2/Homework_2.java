package ru.gb.sanj.homeworks.hw_2;

public class Homework_2 {

    public static void main(String[] args) {
        System.out.println(taskOne(10));
        taskTwo(0);
        System.out.println(taskThree(0));
        taskFour("Hello", 15);
        System.out.println(taskFive(2200));
    }

    // Task 1
    public static boolean taskOne(int num) {
        return num >= 10 && num <= 20;
    }

    // Task 2
    public static void taskTwo(int num) {
        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    // Task 3
    public static boolean taskThree(int num) {
        return num < 0;
    }

    // Task 4
    public static void taskFour(String text, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(text);
        }
    }

    // Task 5
    public static boolean taskFive(int year) {
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

