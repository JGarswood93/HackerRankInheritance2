package com.barton;

public class Dog extends Animal{

    public Dog(){
        super(15);//referencing Animal constructor
        //passing the property age with an int data type
        System.out.println("A dog has been created.");
    }
    public void eat() {
        System.out.println("A dog is eating");
    }
//    public abstract eat();

    /**
     * Behviours that are used in dog class only for dog not for a cat or anything like that
     */
    public void ruff(){
        System.out.println("The dog says ruff");
    }
    public void run(){
        System.out.println("a dog is running");
    }
}
