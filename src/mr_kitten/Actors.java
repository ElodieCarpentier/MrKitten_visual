/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mr_kitten;
import java.util.*;
/**
 * Write a description of class Actors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Actors
{
    // instance variables - replace the example below with your own
    private int actorHealth;
    private String actorName;
    private int attackDamage;
    private String critWeakness;
    private Room position;
    private String punchline;

    /**
     * Constructor for objects of class Actors
     */
    public Actors(String name, int health, int attack, String weakness, Room position, String punchline)
    {
        actorHealth = health;
        actorName = name;
        attackDamage = attack;
        critWeakness = weakness;
        this.position = position;
        this.punchline = punchline;
    }
    
    /**
     * get health
     */
    public int getHealth ()
    {
        return actorHealth;
    }
    
    /**
     * get AD
     */
    public int getAD ()
    {
        return attackDamage;
    }
    
    /**
     * get name
     */
    public String getActorName()
    {
        return actorName;
    }
    
    /**
     * get weakness
     */
    public String getWeakness()
    {
        return critWeakness;
    }
    
    /**
     * get position
     */
    public Room getActorPosition()
    {
        return position;
    }
    
    /**
     * Dori's dialogue
     */
    public static void doryDialogue()
    {
        System.out.println("You got a problem buddy?! Wait, did I just said that? Oh, I just met you,");
        System.out.println("and this is crazy, but here's my number. Hey how is it going mate?");
        System.out.println("Oh I might need your help! Do you know where Marin is going?");
        System.out.println("a - P. Sherman Wallaby Way in Sydney Bitch!");
        System.out.println("b - Somewhere only we know <3");
        System.out.println("c - I heard something that my cousin told me about a women he was seeing in some places"
        +"and that she was sometimes refering to someone as Marin, but i don't know if that's him because my dad also told me she was"
        + "pretty crazy but as my mom said, never trust a man that can't even scratch a butterfly.");
        System.out.println("d - answer d");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter your answer!");
        String answer = keyboard.nextLine();
        boolean good = false;
        switch (answer){
            case "a": if (answer.equals("a")){
                        System.out.println("Oh I remember now!! Thank you big guy!");
                    };good = true;break;
            case "b": if (answer.equals("b")){
                        System.out.println("How romantic is this, give a kiss to Keane for me!");
                    };break;
            case "c": if (answer.equals("c")){
                        System.out.println("You lost me there man...");
                    };break;
            case "d": if (answer.equals("d")){
                        System.out.println("You gotta love panckakes...");
                    };break;    
            default:  System.out.println("what the hell did you just say?"); break;
        }
        if (good){
            good = false;
            System.out.println("I also remember that I have a History test tomorrow!");
            System.out.println("You gotta help me! Just remember me which animal is");
            System.out.println("the great defender of the world!");
            System.out.println("a - Superman! Have you seen his underwear? So much red!");
            System.out.println("b - Magicarpe! Obviously this magesterial fish! And he is red too!");
            System.out.println("c - Etalon du cul! What a french name for a true hero! ");
            System.out.println("d - Do you really want the D?");
            System.out.println("enter your answer!");
            answer = keyboard.nextLine();
            switch (answer){
                case "a": {
                        System.out.println("Never trust somebody that has his underwear on top of his pants!");
                    };break;
            case "b": {
                        System.out.println("His attack dealt too much damage to handle...");
                    };break;
            case "c": {
                        System.out.println("Soooooo good! You are a true scientist!");
                    };good = true;break;
            case "d": {
                        System.out.println("That hardrive doesn't have anything special...");
                    };break;    
                default : System.out.println("How can you do that you witch!");break;
            }
            if (good){
                System.out.println("Good job! You just won an ancient artefact!");
                System.out.println("You recieved: Artefact of true vision");
                //Ajouter à l'équipement l'objet!!
            }
        }
    }
    
    public static void redFishDialog(){
        System.out.println( "Mr Kitten,");
        System.out.println("I am here to inform you that the King of the Waterworld summons you to the underwater court.");
        System.out.println("You will be judged for the murder of one of our beloved citizens, an honest goldfish who used to live in the same house you did.");
        System.out.println("We expect your presence in the court in 3 water days, or else you will be hunted down and executed for your crimes.");
    }
    
    public static void ratatouilleDialog(){
        System.out.println("Hello, young cat. I have heard of you. I think you could use some help in your quest.");
        System.out.println("I can teach you something, and I hope you will make good use of it. I also hope that this action will unite the Cats and Rats race for a very long time.");
        System.out.println("I have a dream that our txo races can live together peacefully.");
    }
    
    public static void mrRobotDialog(){
    System.out.println("Bip Beep Bop, stranger detected. Beep beep, danger incoming");
    System.out.println("Must..destroy...");
    System.out.println("The danger...");
    System.out.println("Beep...");
    }
    
    public static void garfieldDialog(){
    System.out.println("Hey buddy...What are you carrying there?");
    System.out.println("Oh my...Is that the ancient Cat book? Are you a descendant of the Ancients?");
    System.out.println("You look pretty young. I bet you do not know our race story.");
    System.out.println("Long ago, the ancient Cats were very powerful. But today, they have almost disappeared.");
    System.out.println("Today, only small, dumb and domesticated cats remain.");
    System.out.println("Humans made us their pets, can you believe that? They torn families apart, sell our babies to stranger. They kill the free cats that live on the street. These nasty humans even cut some of us when they don't want us to reproduce and have a family.");
    System.out.println("I know this is shocking, but it is the truth.");
    }
    
    public static void sharkDialog(){
        System.out.println("Look at that Bruce! A furry fish! We have to taste that. Prepare to die!");
    }
    
    public static void darkMouleDialog(){
        System.out.println("Who do you think you are?!");
        System.out.println("You cannot prevail, you silly kitty...");
        System.out.println("I will crush you!");
    }
}
