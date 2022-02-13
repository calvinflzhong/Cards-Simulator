public class Card implements Comparable<Card> {
    private String suit;
    private String rank;
    
    //Create all args constructor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
    //Override toString method to be used when printing cards in Deck class
    @Override
    public String toString() {
        return "{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                "} ";
    }
    
    //Overriding compareTo method in order to sort cards in Deck class
    public int compareTo(Card card){
        int cardValue1=0;
        int cardValue2=0;
        
        //Assign values to each card by giving each suit and rank a value
        switch(suit){
            case "♣": cardValue1=0; break;
            case "♦": cardValue1=13; break;
            case "♥": cardValue1=26; break;
            case "♠": cardValue1=39; break;
        }
        switch(card.suit){
            case "♣": cardValue2=0; break;
            case "♦": cardValue2=13; break;
            case "♥": cardValue2=26; break;
            case "♠": cardValue2=39; break;
        }
        switch(rank){
            case "2": cardValue1+=1; break;
            case "3": cardValue1+=2; break;
            case "4": cardValue1+=3; break;
            case "5": cardValue1+=4; break;
            case "6": cardValue1+=5; break;
            case "7": cardValue1+=6; break;
            case "8": cardValue1+=7; break;
            case "9": cardValue1+=8; break;
            case "10": cardValue1+=9; break;
            case "J": cardValue1+=10; break;
            case "Q": cardValue1+=11; break;
            case "K": cardValue1+=12; break;
            case "A": cardValue1+=13; break;
        }
        switch(card.rank){
            case "2": cardValue2+=1; break;
            case "3": cardValue2+=2; break;
            case "4": cardValue2+=3; break;
            case "5": cardValue2+=4; break;
            case "6": cardValue2+=5; break;
            case "7": cardValue2+=6; break;
            case "8": cardValue2+=7; break;
            case "9": cardValue2+=8; break;
            case "10": cardValue2+=9; break;
            case "J": cardValue2+=10; break;
            case "Q": cardValue2+=11; break;
            case "K": cardValue2+=12; break;
            case "A": cardValue2+=13; break;
        }
        
        //Compare values of cards using assigned values
        if (cardValue1<cardValue2){
            return -1;
        }else if(cardValue1>cardValue2){
            return 1;
        }else{
            return 0;
        }
    }
}
