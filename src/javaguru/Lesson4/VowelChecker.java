package javaguru.Lesson4;

public class VowelChecker {

    public boolean isVowel(char character) {
        if (character == 'A'
                || character == 'E'
                || character == 'I'
                || character == 'O'
                || character == 'U'
                || character == 'a'
                || character == 'e'
                || character == 'i'
                || character == 'o'
                || character == 'u') {
            return true;
        } else {
            return false;
        }
    }
}
