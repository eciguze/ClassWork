package javaguru.Lesson7.carddeck;

import javaguru.Lesson2.RandomGen;

import java.util.Random;

public class CardDeck {

    private static final String[] SUITE = {"S", "H", "D", "C"};
    private static final String[] VALUE = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static final int SHUFFLE_COUNT = 1000;

    private String[] deck = new String[calculateSize()];
    private Random randomGenerator = new Random();

    private int calculateSize() {
        return SUITE.length * VALUE.length;
    }

    CardDeck() {
        create();
    }

    void shuffle() {
        int count = SHUFFLE_COUNT;
        for (int i = 0; SHUFFLE_COUNT>i; i++) {
            int index1 = generateNumber();
            int index2 = generateNumber();

            String card1 = deck[index1];
            String card2 = deck[index2];

            deck[index1] = card2;
            deck[index2] = card1;

            count--;
        }

    }

    private int generateNumber() {
        return randomGenerator.ints(0, deck.length - 1).findFirst().getAsInt();
    }

    private void create() {
        int deckCounter = 0;
        for (String suite : SUITE) {
            for (String value : VALUE) {
                deck[deckCounter++] = suite + value;
            }
        }
    }

    public String[] getDeck() {
        return deck;
    }
}
