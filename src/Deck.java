import java.util.Arrays;

public class Deck {
    Card[] card;
    
    //Method to initiate array of 52 cards and assign cards by order of smallest to largest card
    public void createDeck(){
        card = new Card[52];
        for(int i=0; i<52; i++){
            String s="error";
            String r="error";
            
            //Choose suit to assign
            if (i<13){
                s="♣";
            }else if(i<26){
                s="♦";
            }else if(i<39){
                s="♥";
            }else{
                s="♠";
            }
            
            //Choose rank to assign
            switch(i%13){
                case 0: r="2"; break; 
                case 1: r="3"; break;
                case 2: r="4"; break;
                case 3: r="5"; break;
                case 4: r="6"; break;
                case 5: r="7"; break;
                case 6: r="8"; break;
                case 7: r="9"; break;
                case 8: r="10"; break;
                case 9: r="J"; break;
                case 10: r="Q"; break;
                case 11: r="K"; break;
                case 12: r="A"; break;
            }
            
            //Assign suit and rank of card
            card[i] = new Card(s,r);
        }
    }
    
    //Method to sort elements of array of cards using overridden compareTo method in Card class
    public void sort(){
        Arrays.sort(card);
    }
    
    //Method to shuffle each element of array randomly
    public void shuffle(){
        int index2;
        Card tempCard;
        
        for(int i=0; i<52; i++){
            index2 = (int)(Math.random()*52);
            while(i==index2){
                index2 = (int)(Math.random()*52);
            }
            tempCard=card[i];
            card[i]=card[index2];
            card[index2]=tempCard;
        }
    }
    
    //Getter method for array of cards
    public Card[] getCards(){
        return card;
    }

    //Method to show cards in array
    public void showCards(){
        for(int i=0; i<card.length; i++){
            System.out.print("Card " + (i+1) + card[i]);
        }
    }
    
}
