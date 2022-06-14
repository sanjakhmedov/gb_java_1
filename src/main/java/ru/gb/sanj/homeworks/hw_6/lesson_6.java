package ru.gb.sanj.homeworks.hw_6;


public class lesson_6 {

    public static void main(String[] args) {
        final Cat catKane = new Cat("Kane");
        final Dog dogTom = new Dog("Tom");
        final Cat catKitty = new Cat("Kitty");

        catKitty.run(250);
        dogTom.run(450);

        catKane.swim(5);
        dogTom.swim(9);
    }


}
