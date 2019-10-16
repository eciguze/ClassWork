package javaguru.Lesson3;


import java.awt.*;

public class DogTest {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 2015);
        doDogRoutine(rex);

        Dog bob = new Dog("Bob", Color.GRAY);

        doDogRoutine(bob);


    }

    private static void doDogRoutine(Dog bob) {
        bob.eat();
        bob.sleep();
        bob.voice();

        System.out.println("The dog is " + bob.getAge() + "  years old ");
        System.out.println("My name is " + bob.getName());
        System.out.println("My color is  " + bob.getColor());
    }
}
