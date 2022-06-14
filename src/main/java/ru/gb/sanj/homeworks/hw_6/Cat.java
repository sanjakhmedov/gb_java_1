package ru.gb.sanj.homeworks.hw_6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void run(int meter) {
        if (meter > 200) {
            System.out.println(getName() + " can't run more than " + 200 + " meters!");
        } else {
            System.out.println(getName() + " has run " + meter + " meters!");
        }
    }

    public void swim(int meter) {
        System.out.println("These cats can't swim!!!");
    }

}
