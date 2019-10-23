package javaguru.Lesson5;

public class BasicCounterTest {

    public static void main(String[] args) {

        shouldIncrementCounterByOne();
        shouldDecrementValueByOne();
        shouldDefaultValueBeZero();
        shouldClearCounterValue();
        shouldSetPositiveCounterValue();
        shouldBeZeroWhenSetNegativeValue();
    }

    private static void shouldBeZeroWhenSetNegativeValue() {
        BasicCounter counter = new BasicCounter();
        counter.setValue(-10);
        int result = counter.getValue();
        int expectedResult = 0;
        printResults(result, expectedResult, "shouldBeZeroWhenSetNegativeValue");
    }

    private static void printResults(int result, int expectedResult, String testName) {
        if (result == expectedResult) {
            System.out.println("Test " + testName + " PASSED!");
        } else {
            System.out.println("Test " + testName + " FAILED!");
        }
    }

    private static void shouldSetPositiveCounterValue() {
        BasicCounter counter = new BasicCounter();
        counter.setValue(10);
        int result = counter.getValue();
        int expectedResult = 10;
        printResults(result, expectedResult, "shouldSetPositiveCounterValue");
    }

    private static void shouldClearCounterValue() {
        BasicCounter counter = new BasicCounter();
        int result = counter.getValue();
        int expectedResult = 0;
        counter.clear();
        printResults(result, expectedResult, "shouldClearCounterValue");
    }

    private static void shouldDefaultValueBeZero() {
        BasicCounter counter = new BasicCounter();
        int result = counter.getValue();
        int expectedResult = -1;
        counter.decrement();
        printResults(result, expectedResult,"shouldDefaultValueBeZero");
    }

    private static void shouldDecrementValueByOne() {
        shouldDefaultValueBeZero();
    }

    private static void shouldIncrementCounterByOne() {
        BasicCounter counter = new BasicCounter();
        counter.increment();
        int result = counter.getValue();
        int expectedResult = 1;

        printResults(result, expectedResult," shouldIncrementCounterByOne");
    }
}
