package ru.gb.sanj.homeworks.hw_6;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int meter);

    public abstract void swim(int meter);

}
