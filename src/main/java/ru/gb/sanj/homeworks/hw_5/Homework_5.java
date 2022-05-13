package ru.gb.sanj.homeworks.hw_5;

import java.util.Arrays;

public class Homework_5 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("fullName1", "postion1", "email1", "phone1", 1, 1),
                new Employee("fullName2", "postion2", "email2", "phone2", 2, 1),
                new Employee("fullName3", "postion3", "email3", "phone3", 3, 41),
                new Employee("fullName4", "postion4", "email4", "phone4", 4, 51),
                new Employee("fullName5", "postion5", "email5", "phone5", 5, 22)
        };

        for (Employee employee : employees) {
            if(employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
