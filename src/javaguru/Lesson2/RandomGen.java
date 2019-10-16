package javaguru.Lesson2;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(11);
        System.out.println("Random number is: " + randomNumber);



    }
}