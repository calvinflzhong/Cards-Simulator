public class practice {
    public static void main(String[] args){
        System.out.println("Create a deck of cards: ");
        Deck deck = new Deck();
        deck.create();
        deck.showCards();
        
        System.out.println("\n\nShuffled Cards: ");
        deck.shuffle();
        deck.showCards();

        System.out.println("\n\nSorted Cards: ");
        deck.sort();
        deck.showCards();
    }
}
