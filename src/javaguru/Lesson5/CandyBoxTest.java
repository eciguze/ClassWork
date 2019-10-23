package javaguru.Lesson5;

public class CandyBoxTest {
    public static void main(String[] args) {

        CandyBox prozzitBox = new CandyBox("Prozzit", 8);
        CandyBox prozzitBoxBig = new CandyBox("Prozzit", 16);
        boolean expectedResult = true;

        System.out.println("CandyBox  equals TRUE test");
        boolean actualResult = prozzitBox.equals(prozzitBoxBig);

        if (actualResult) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!");
            System.out.println("Expected: " + expectedResult);
            System.out.println("Actual: " + actualResult);
        }
        System.out.println(prozzitBox);
        System.out.println(prozzitBoxBig);
    }
}
