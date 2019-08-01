package com.barton;

public class Cat extends Animal {

    public Cat() {
        super(7);
        System.out.println("A cat has been created");
    }

    /**
     * Behviours that are used in dog class only for a cat not for a dog or anything like that
     */
    public void meow() {
        System.out.println("A cat meows");
    }

    public void prance() {
        System.out.println("A cat prances");


        }
    public void eat () {
        System.out.println("A dog is eating");
    }
}
