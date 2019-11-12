package javaguru.Lesson7.carddeck;

public class CardDeckUtils {

    public static void print(CardDeck cardDeck) {

        String[] deck = cardDeck.getDeck();
        for (String card : deck){
            System.out.print(card);
        }
        System.out.println();
    }
}
