package javaobjectoriented._02_overriding;

class Animal {
    public void move() {
       System.out.println("Animals can move");
    }
 }
 
 class Dog extends Animal {
    public void move() {
       System.out.println("Dogs can walk and run");
    }
 }
 
 public class TestDog {
 
    public static void main(String args[]) {

       Animal animal = new Animal();   // Animal reference and object
       Animal dog = new Dog();   // Animal reference but Dog object
 
       animal.move();   // runs the method in Animal class
       dog.move();   // runs the method in Dog class

    }
 }