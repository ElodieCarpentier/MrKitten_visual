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
 * Write a description of class LockedDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LockedDoor extends Door
{
    private Item Key;

    /**
     * Constructor for objects of class LockedDoor
     */
    public LockedDoor(Item Key, Room currentRoom, Room room2)
    {
    super (currentRoom, room2);
    this.Key = Key;
    }
    
    /**
       * 
    */
    public Room openLockedDoor(ArrayList<Item> a, Room currentRoom)
    {
        boolean hasKey = false;
        for(Item k:a){
            if (k.getName().equals(Key.getName())){
                hasKey = true;
                System.out.println(k.getName()+" used");
            }
        }
        Room r = super.getRoom(currentRoom);//retourne la next room
        if (hasKey) {
            System.out.println(r.getName());
            return r;
        }
        else {
            System.out.println("You don't seem to have the "+Key.getName()+" with you! Find it and try again");
            return currentRoom;
        }
    }

}
