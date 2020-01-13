import java.lang.reflect.Array;
import java.util.ArrayList;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public DeckOfCards(){
        deck = new ArrayList<Card>();

        //create 52 Card objects and store in the deck

    }
}
