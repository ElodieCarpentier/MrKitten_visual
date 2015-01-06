/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mr_kitten;

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
        
    }
}
