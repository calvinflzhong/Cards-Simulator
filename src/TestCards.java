import java.util.Scanner;

public class TestCards {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        //Exception handling
        try {
            
        //Variable for users to choose options
        int userOption;
        Deck deck=new Deck();
        
            do {
                //Prompt user to choose options
                System.out.println("Please choose from the following options by inputting the integer beside it: " +
                        "\nExit:                                                                0" +
                        "\nGenerate deck of cards ordered from smallest to biggest and display: 1" +
                        "\nGenerate random deck of cards and display:                           2" +
                        "\nChoose your option: ");

                userOption = input.nextInt();
                
                //Run options of exiting, creating ordered deck, creating shuffled deck
                switch (userOption) {
                    case 0 -> System.exit(0);
                    case 1 -> {
                        deck.createDeck();
                        deck.showCards();
                    }
                    case 2 -> {
                        deck.createDeck();
                        deck.shuffle();
                        deck.showCards();
                    }
                    default -> {

                    }
                }
            }while(userOption!=1 && userOption!=2);
            
            //Prompt user to choose options again
            while(true) {
                System.out.println("\n\nPlease choose from the following options by inputting the integer beside it: " +
                        "\nExit:                                                                0" +
                        "\nShuffle deck of cards and display:                                   1" +
                        "\nSort deck of cards and display:                                      2" +
                        "\nChoose your option: ");

                userOption = input.nextInt();
                
                //
                if(userOption==0)
                    System.exit(0);
                if(userOption>2 || userOption<0)
                    continue;

                switch (userOption) {
                    case 1 -> {
                        deck.shuffle();
                        deck.showCards();
                    }
                    case 2 -> {
                        deck.sort();
                        deck.showCards();
                    }
                }
            }
        }catch (Exception ex) {
            System.out.println(ex);
        }
        input.close();
    }

}
