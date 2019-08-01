package com.barton;

public abstract class Animal {
    private int age;

    /**
     * This will show the relationship between sub class and parent class
     * All animals will have the behviour below (and property) its age and whether it
     * is eating
     */
    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("An animal is sleeping");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        /**
         * Calling different methods their behaviours and properties, age prance, meow bark etc
         */
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();//from abstract class
        c.eat();
        d.sleep();
        d.getAge();
        c.getAge();
        /**
         * Casting
         */
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.ruff();

        Object str = "est";
        String realS = (String) str;
        realS.getBytes();

        Dog dogi = new Dog();
        if (d instanceof Animal) {
            Animal animal = (Animal) dogi;
            animal.sleep();
            animal.eat();
        }
    dogi.sleep();

    }
}