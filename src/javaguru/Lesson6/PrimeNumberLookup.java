package javaguru.Lesson6;

public class PrimeNumberLookup {
    public void printWithinInterval(int from, int to) {
        System.out.println();
        for (int i = from; i <= to; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + ", ");

            }
        }
    }

    private boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
