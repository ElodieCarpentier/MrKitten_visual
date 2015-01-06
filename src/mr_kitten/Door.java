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
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    // instance variables - replace the example below with your own
    private Room nextRoom;
    private Room room2;

    /**
     * Constructor for objects of class Door
     */
    public Door(Room room, Room room2)
    {
        // initialise instance variables
        this.nextRoom = room;
        this.room2 = room2;
    }
    
    /**
     * Returns the room after the door.
     */
    public Room getRoom (Room currentRoom){
        if (room2 == currentRoom){
           return nextRoom;
        }
        else{
            return room2;
        }
    }
}

