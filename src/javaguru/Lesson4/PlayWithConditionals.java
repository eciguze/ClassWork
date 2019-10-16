package javaguru.Lesson4;

public class PlayWithConditionals {
    public static void main(String[] args) {

        int x = 10;

        if ((x > 5) && (x < 15)) {
            System.out.println("X is within bounds");
        }
        if (x < 5 || x >= 10) {
            System.out.println("X is correct");
        }
        if ((x > 5 && x < 10) || (x >= 10 && x <= 20)) {
            System.out.println("X is correct 2nd time");
        }
        if (x != 20) {
            System.out.println("X is not 20");
        }
        if ((x < 5 && x > 15) || (x == 10)) {
            System.out.println("X is 10");
        }
        if (x == 10)
            System.out.println("X is ten");
        else if (x == 11)
            System.out.println("X is eleven");
        else
            System.out.println("X is something else");

        String message = x == 10
                ? "X is ten"
                : "X is not ten";
        System.out.println(message);
    }
}
