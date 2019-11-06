package javaguru.Lesson6;

public class MultiplicationTable {
    public void print(int seize) {

        publicHeaders(seize);

        for (int i = 1; i <= seize; i++) {
            for (int j = 1; j <= seize; j++) {
                System.out.format("%4d", calculate(i, j));
            }
            System.out.println();
        }
    }

    private void publicHeaders(int seize) {
        for (int i = 1; i <= seize; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();

        for(int i = 0; i <= seize; i++){
            System.out.print("----------");
        }
        System.out.println();
    }

    private int calculate(int i, int j) {
        return i * j;
    }
}
