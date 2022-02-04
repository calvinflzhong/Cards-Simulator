import java.util.Arrays;

public class Deck extends Cards{
    public void create(){
        card = new Card[52];
        for(int i=0; i<52; i++){
            String s="error";
            String r="error";
            
            if (i<13){
                s="♣";
            }else if(i<26){
                s="♦";
            }else if(i<39){
                s="♥";
            }else{
                s="♠";
            }
            
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
            card[i] = new Card(s,r);
        }
    }
    
    public void sort(){
        Arrays.sort(card);
    }
    
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
    
    public void showCards(){
        for(int i=0; i<card.length; i++){
            System.out.print(card[i]);
        }
    }
    
}
