import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public DeckOfCards(){
        deck = new ArrayList<Card>();

        //create 52 Card objects and store in the deck
        List<String> faceNames = Card.getAllFaceNames();
        List<String> suits = Card.getValidSuits();

        for (String suit : suits)
        {
            for (String faceName : faceNames)
                deck.add(new Card(faceName, suit));
        }
    }

    /**
     * This method will display the deck to the console
     */
    public void displayDeck()
    {
        for (Card card:deck)
            System.out.println(card);
    }
}
