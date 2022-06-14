package ru.gb.sanj.homeworks.hw_3;

import java.util.Arrays;

public class Homework_3 {
    public static void main(String[] args) {
        //changeNumPlace();
        //fillInArray();
        //multiplyByTwo();
        //fillInDiagonal();
        //fillInArr(5,7);
        //checkArrMaxAndMin();
        //System.out.println(checkArr(new int[]{1, 5, 2, 5, 5, 6, 2}));
        //moveIndex(new int[]{1, 2, 3, 4, 5, 6, 7}, -2);
    }

    // Task 1
    public static void changeNumPlace() {
        int[] arr = {1, 0, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Task 2
    public static void fillInArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Task 3
    public static void multiplyByTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Task 4
    public static void fillInDiagonal() {
        int[][] square = new int[7][9];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == j) {
                    square[i][j] = 1;
                }
                System.out.print(square[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Task 5
    public static int[] fillInArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    // Task 6

    public static void checkArrMaxAndMin() {
        int[] arr = {12, 20, 3, 9, 14, 8, 2, 19, 28, 10, 10, 17, 5, 19, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Smallest value is " + min);
        System.out.println("Largest value is " + max);
    }

    // Task 7

    public static boolean checkArr(int[] arr) {
        int sum = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        for (int i = 0; i < arr.length; i++) {
            currentSum = arr[i] + currentSum;

            if (currentSum == sum / 2) {
                return true;
            }
        }
        return false;
    }

    // Task 8
    public static void moveIndex(int[] arr, int n) {
        int buf;

        for (int i = 0; i < arr.length-n; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                buf = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = buf;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}





