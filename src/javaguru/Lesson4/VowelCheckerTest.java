package javaguru.Lesson4;

public class VowelCheckerTest {

    static void check(boolean expectedResult, boolean actualResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has PASSED");
        } else {
            System.out.println(testName + " has FAILED");
            System.out.println("Actual: " + actualResult + ", but Expected: " + expectedResult);
        }
    }

    public static void main(String[] args) {
        VowelChecker vowelChecker = new VowelChecker();

        boolean expectedResult = true;
        boolean actualResult = vowelChecker.isVowel('A');
        check(expectedResult, actualResult, "shouldBeVowel_A");

        expectedResult = true;
        actualResult = vowelChecker.isVowel('E');
        check(true, vowelChecker.isVowel('E'), "shouldBeVowel_E");

        expectedResult = true;
        actualResult = vowelChecker.isVowel('I');
        check(true, vowelChecker.isVowel('I'), "shouldBeVowel_I");

        expectedResult = true;
        actualResult = vowelChecker.isVowel('O');
        check(true, vowelChecker.isVowel('O'), "shouldBeVowel_O");

        expectedResult = true;
        actualResult = vowelChecker.isVowel('U');
        check(true, vowelChecker.isVowel('U'), "shouldBeVowel_U");
    }
}