/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mr_kitten;

/**
 *
 * @author Arya
 */

import java.util.*;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public class Room 
{
    private String description;
    private String name;
    private HashMap <String,Door> HM;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description, String name) 
    {
        this.description = description;
        this.name = name;
        HM = new HashMap <String,Door> ();
    }
    
    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void addExit(String direction, Door door){
        HM.put(direction,door);
    }

    /**
    *Prints out the possible exits of a room
    * clé de la hashmap : direction
    * objet :  Room
    */
    public void printExits()
    {
        for ( String exit : HM.keySet() ) {
            System.out.println(exit);
        }
    }
    
    public Door getNextRoom(String direction){
        return HM.get(direction);
    }
    
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    public String getName() {
        return name;
    }
}
