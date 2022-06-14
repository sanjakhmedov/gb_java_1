package ru.gb.sanj.homeworks.hw_6;

import ru.gb.sanj.classes.lesson_6.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void run(int meter) {
        if (meter > 500) {
            System.out.println(getName() + " can't run more than " + 500 + " meters!");
        } else {
            System.out.println(getName() + " has run " + meter + " meters!");
        }
    }

    public void swim(int meter) {
        if (meter > 10) {
            System.out.println(getName() + " can't swim more than " + 10 + " meters!");
        } else {
            System.out.println(getName() + " has swum " + meter + " meters!");
        }
    }
}
