package javaguru.Lesson7;

public class PlayWith2DArrays {
    public static void main(String[] args) {

        int[][] numberArray = {
                {1, 5, 4},
                {3, 6, 9, 0},
                {2, 8, 3, 5}
        };

        printClassicWay(numberArray);
        printAdvancedWay(numberArray);
    }

    private static void printAdvancedWay(int[][] numberArray) {
        for (int[] intArray : numberArray) {
            for (int number : intArray){
                System.out.print(number + ", ");
            }
                System.out.println();
        }
    }

    private static void printClassicWay(int[][] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                System.out.print(numberArray[i][j] + ", ");
            }
            System.out.println();

        }
    }
}
