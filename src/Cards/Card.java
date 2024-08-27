package Cards;

public class Card {
    // state (instance variables)
    private String suit;
    private String rank;

    // constructor(s)
    public Card(String r, String s){
        // Give values to the instance variables!
        rank = r;
        suit = s;
    }

    // behavior
    // EVERY Java class has a toString. The default version is usually crap.
    // We can do better than cards.Card@...
    public String toString(){
        return "(" + rank + "," + suit + ")";
    }



}