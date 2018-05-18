import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Player here.
 *
 * @author (Larson)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;//name
    private int cash;//total cash
    private int handTotal;//Hand total
    public ArrayList<Card> hand;//to hold Cards
    /**
     * Constructor for objects of class Player
     */
    public Player(String nm, int c, int h)
    {
        this.name = nm;
        this.cash = c;
<<<<<<< HEAD
        this.handTotal = h;
=======
        this.handSize = h;
>>>>>>> dfb9eaade096c5c16c7a65b57c9d629779a24f2a
    }    
    public int bet(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please State Your Bet");
        int bet = scan.nextInt();
        this.cash -= bet;
        return bet;
    }    
<<<<<<< HEAD
    public int handTotal(){
=======
    
    public int handSize(){
>>>>>>> dfb9eaade096c5c16c7a65b57c9d629779a24f2a
        int total = 0;
        int aceTotal = 0;
        for(Card c : hand){
            if(c.getValue() == 11){
                aceTotal += 1;
            }
            total += c.getValue();
        }         
        if(aceTotal > 0 && total + 11 < 22){
            total += 11;
        }       
        return total;
    }    
    public String toString(){
        return null;
    }    
    public int getCash(){
        return this.cash;
    }
    public void addCash(int t){
        this.cash += t;
    }       
}

