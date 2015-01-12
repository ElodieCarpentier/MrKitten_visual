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
    public void doryDialogue()
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
        switch (4){
            case 1: if (answer.equals("a")){
                        System.out.println("Oh I remember now!! Thank you big guy!");
                    };good = true;break;
            case 2: if (answer.equals("b")){
                        System.out.println("How romantic is this, give a kiss to Keane for me!");
                    };break;
            case 3: if (answer.equals("c")){
                        System.out.println("You lost me there man...");
                    };break;
            case 4: if (answer.equals("d")){
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
            switch (4){
                case 1: if (answer.equals("a")){
                        System.out.println("Never trust somebody that has his underwear on top of his pants!");
                    };break;
            case 2: if (answer.equals("b")){
                        System.out.println("His attack dealt too much damage to handle...");
                    };break;
            case 3: if (answer.equals("c")){
                        System.out.println("Soooooo good! You are a true scientist!");
                    };good = true;break;
            case 4: if (answer.equals("d")){
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
}
