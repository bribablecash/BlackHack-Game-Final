import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (Larson)
 * @version (a version number or a date)
 */
public class Game
{
    private Player u;
    private Player d;
    private Deck deckOfCards;   
<<<<<<< HEAD
    private int c ;
=======
    private int c;
>>>>>>> dfb9eaade096c5c16c7a65b57c9d629779a24f2a
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        this.deckOfCards = new Deck();
        u = new Player("U", 100, 2);
        d = new Dealer();
        Greeting();
        playGame();
    }
    public void playGame(){
        this.deckOfCards.initializeDeck();
        this.deckOfCards.shuffle();
        int b = u.bet();      
        this.u.hand = this.deckOfCards.deal();
        this.d.hand = this.deckOfCards.deal();    
        playerTurn();
        dealerTurn();       
        int win = Winner();     
<<<<<<< HEAD
        if(win == 2){
            System.out.println("The dealer wins");
            System.out.println("You have " +u.getCash() + " dollars");
=======
        if(win == -1){
            DealerWins();
            System.out.println("You have " +(u.getCash() - u.bet()) + " dollars");
>>>>>>> dfb9eaade096c5c16c7a65b57c9d629779a24f2a
        }
        else if(win == 1){
            System.out.println("It's a tie");
            u.addCash(b);
            System.out.println("You have " + u.getCash() + " dollars");
        }
        else{
            System.out.println("You win");
            u.addCash(2*b);
            System.out.println("You have " + u.getCash() + " dollars");
        }     
        System.out.println("Do you want to play another game? (y/n)");
        Scanner scan = new Scanner(System.in);
        String cont = scan.nextLine();       
        if(cont.equals("y")){
            playGame();
        }      
    }    
    public int Winner(){
        int pTotal = u.handTotal();
        int dTotal = d.handTotal();        
        // if 1 player wins, if -1 dealer wins, if 0 tie
        int winner = 0;                
        if(pTotal > 21 && dTotal <= 21){
            winner = 2;
        }
        else if(dTotal > 21 && pTotal <= 21){
            winner = 1;
        }
        else if(dTotal == pTotal){
            winner = 0;
        }
        else if(pTotal <= 21 && dTotal <= 21){
            if(pTotal > dTotal){
                winner = 1;
            }
            else{
                winner = 2;
            }
        }        
        return winner;
    }   
    public void endGame(){
        System.out.println("Your final amount of money " + + u.getCash() + " dollars");
        System.out.println();
        System.out.println("Good Game");
    }   
    public void Greeting(){
        System.out.println("Welcome to BlackJack");
        System.out.println("You have " + u.getCash() + " dollars");
        System.out.println();
    }    
    public void StartingBet(){
        printPlayerHand();        
        System.out.println("The dealer is showing: ");
        System.out.println(d.hand.get(0));        
        System.out.println("Choose one of the following:");
        System.out.println("hit");
        System.out.println("stand");
<<<<<<< HEAD
    }        
    public void printPlayerHand(){
      System.out.println("Your hand is: ");
      for(Card c : u.hand) {
          System.out.println(c); //toString on Card
        }
    }    
=======
    }    
    public void PlayerWins(){
        System.out.println("You win");
    }   
    public void TiePay(){
        System.out.println("It's a tie");
    }    
    public void DealerWins(){
        System.out.println("\nThe dealer wins");
    }     
    public void printPlayerHand(){
        System.out.println("\nYour hand is: ");
        for(c = 0; c < u.hand.size(); c++){
        c = u.hand.size();
        System.out.println(c);
     }    
    }
    public void GameOver(){
        System.out.println("Your final amount of money " + + u.getCash() + " dollars");
        System.out.println();
        System.out.println("Good Game");
    }
>>>>>>> dfb9eaade096c5c16c7a65b57c9d629779a24f2a
    public void playerTurn(){
        while(true){
            if(u.handTotal() >= 21){
                printPlayerHand();
                System.out.println("The dealer is showing: ");
                System.out.println(d.hand.get(0));
                break;
            }              
            }           
        StartingBet();            
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();            
        if(choice.equals("hit")){
                this.u.hand.add(deckOfCards.getFirstCard());
        }else{
                
            }
        }
    public void dealerTurn(){
<<<<<<< HEAD
        while(d.handTotal() < 17){
            this.d.hand.add(deckOfCards.getFirstCard());
        }        
        System.out.println("The dealer has: " + d.handTotal());
        for(c = 0; c < d.hand.size(); c++){
=======
         while(d.handSize() < 17){
            this.d.hand.add(deckOfCards.getFirstCard());
        }        
        System.out.println("\nThe dealer has: " + d.handSize());
         for(c = 0 ;c < d.hand.size(); c++){
        System.out.println("The dealer has: " + d.handSize());
        for(Card c : d.hand){
>>>>>>> dfb9eaade096c5c16c7a65b57c9d629779a24f2a
            System.out.println(c);
        }
        }    
    }
    public void showHands(){
        System.out.println("Player");
        for(c = 0; c < u.hand.size(); c++){
            System.out.println(c);
        }
        System.out.println("Dealer");
        for(c = 0; c < d.hand.size(); c++){
            System.out.println(c);
        }
    }
}
