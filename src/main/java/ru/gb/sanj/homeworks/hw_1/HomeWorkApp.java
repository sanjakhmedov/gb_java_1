package ru.gb.sanj.homeworks.hw_1;

//Task 1
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

//Task 2
    public static void printThreeWords() {
        System.out.println("Orange\n" +
                "Banana\n" +
                "Apple");
    }

//Task 3
    public static void checkSumSign() {
        int a = 21, b = -22;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

//Task 4
    public static void printColor() {
        int value = 110;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

//Task 5
    public static void compareNumbers() {
        int a = 9, b =10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
