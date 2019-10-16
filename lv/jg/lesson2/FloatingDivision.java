package lv.jg.lesson2;

public class FloatingDivision {
    public static void main(String[] args) {
        int a, b, resultIntDiv;
        double resultDoubleDiv, resultCastingDiv;

        a = 10;
        b = 4;

        resultIntDiv = a / b;
        resultDoubleDiv = a / b;
        resultCastingDiv = a / (double) b;

        System.out.println(resultIntDiv + "," + resultCastingDiv + "," + resultDoubleDiv);


    }
}
