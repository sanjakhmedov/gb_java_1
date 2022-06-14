package ru.gb.sanj.classes;

//* Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        checkRange(16,5);
        //    print("this text", 3);
//        isLeapYear(2013);
//        arr();
//        arrLength();
//        multiplyByTwo();
//        square(7);
//        fillArray(7, 5);
//        checkMaxMin();
//        System.out.println(checkBalance(new int[]{6, 1, 7}));
//        moveArray(new int[] { 1, 2, 3, 4 }, 2);


        Scanner sc = new Scanner(System.in);

        String one = sc.nextLine().toLowerCase();
        String two = sc.nextLine().toUpperCase();
        String three = sc.nextLine();

        System.out.println(three);
        System.out.println(two);
        System.out.println(one);


    }
//
//    public static void moveArray(int[] arr, int n) {
//        for (int i = 1; i < arr.length; i++) {
//            arr[i - 1] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//
//
//    public static boolean checkBalance(int[] arr) {
//
//        int sum = 0;
//        int currentSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = arr[i] + sum;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            currentSum = arr[i] + currentSum;
//            if (currentSum == sum / 2) {
//                return true;
//            }
//        }
//        return false;
//
//    }
//
//
//    public static void checkMaxMin() {
//        int[] arr = {0, 5, 3, 2, 19, 4, 5, 2, 4, 8, 9, 1};
//        int min = arr[0];
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("Smallest number in this array is " + min);
//        System.out.println("Largest number in this array is " + max);
//    }
//
//    public static int[] fillArray(int len, int initialValue) {
//        int[] arr = new int[len];
//        for (int i = 0; i < len; i++) {
//            arr[i] = initialValue;
//        }
//        System.out.println(Arrays.toString(arr));
//        return arr;
//    }
//
//    public static int[][] square(int n) {
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j) {
//                    arr[i][j] = 1;
//                }
//                arr[i][arr.length - i - 1] = 1;
//                System.out.print(arr[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        return arr;
//    }
//
//
//    public static void multiplyByTwo() {
//        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 6) {
//                arr[i] *= 2;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//
//
//    public static void arrLength() {
//        int[] array = new int[100];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(array));
//    }
//
//
//    public static void arr() {
//        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 1) {
//                array[i] = 0;
//            } else if (array[i] == 0) {
//                array[i] = 1;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
//
//
//    public static boolean isLeapYear(int year) {
//        if (year % 4 == 0) {
//            return true;
//        } else if (year % 100 == 0) {
//            return false;
//        } else if (year % 400 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static void checkRange(int a, int b) {
//        if (a + b >= 10 && a + b <= 20) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//
//    }
//
//    public static void print(String text, int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.println(text);
//        }
//    }

}