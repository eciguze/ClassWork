package lv.jg.lesson2;

import java.util.Random;

public class TriangleAreaCalculator {
    public static void main(String[] args) {

         Random random = new Random();
        double height = random.nextInt(15);
        ;
        double width = random.nextInt(18);
        ;

        double AreaResult = (height * width) / 2;

        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.printf("AreaResult = " + AreaResult);

    }
}
