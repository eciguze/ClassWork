package lv.jg.lesson2;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        Random random = new Random();
        int generatedNumber = random.nextInt(101);
        System.out.println("Generated number is:" + generatedNumber);
    }
}
