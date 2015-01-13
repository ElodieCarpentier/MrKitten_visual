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
 * Items with description and weight
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String itemName;
    private int itemWeight;
    private String itemDescription;
    //private static ArrayList<Item> tabItem = new ArrayList<Item>();
    
    
    /**
     * Constructor for objects of class Item
     */
    public Item(String name, String description, int weight)
    {
        itemName = name;
        itemDescription = description;
        itemWeight = weight;
        //tabItem.add(this);
    }
    
    public String getName()
    {
        return itemName;
    }
    
    public String getDescription()
    {
        return itemDescription;
    }
    
    public int getWeight()
    {
        return itemWeight;
    }
    
    public String lookItem()
    {
        String s = (getName()+ "\n"+ getDescription());
        return s;
    }
    
    /*public static ArrayList getTab()
    {
        return tabItem;
    }
    
    public void addItem(String name, String description, int weight)
    {
        Item item = new Item(name,description,weight);
        tabItem.add(item);
    } */  
}
