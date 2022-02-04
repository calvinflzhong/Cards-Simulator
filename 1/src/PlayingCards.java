public class PlayingCards {
    public static void main(String[] args){
        System.out.println("Playings Cards");
        Deck deck = new Deck();
        deck.create();

        System.out.println("Sorted cards");
        deck.sort();
        deck.showCards();

        System.out.println("Shuffled cards");
        deck.shuffle();
        deck.showCards();
    }

}
