package mr_kitten;


import java.util.Random;

/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
    private Players MrKitten;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        createItems();
        MrKitten = new Players("Mr.Kitten");
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        //Room outside, theatre, pub, lab, office;
        Room kitchen,livingRoom,bedroom,street1,street2,sewer,petshop,theGreatDescent,dory,theFishPalace;
        Room tavernSanRicardo,starWars,theCloset,theEnd;
        
        
        kitchen = new Room ("are in the Kitchen of the Master's house");
        livingRoom = new Room ("are in the Living room of the Master's house");
        bedroom = new Room ("are in the Bedroom of the Master's house");
        street1 = new Room ("are in the Street near the entrance of the house");
        street2 = new Room ("are in the Street near the Petshop");
        sewer = new Room ("are in the Sewer under the streets");
        petshop = new Room ("are in the Petshop");
        theGreatDescent = new Room ("are going deep down under water");
        dory = new Room ("are with Dory the great fish");
        theFishPalace = new Room ("are in the Fish Palace");
        tavernSanRicardo = new Room ("are in the magnificient Tavern Of San Ricardo");
        starWars = new Room ("are in a Galaxy far far away...");
        theCloset = new Room ("are ready to fight with lions");
        theEnd = new Room ("did it, you did it, Yeah!");
        
        Door doorKLr = new Door(livingRoom,kitchen); kitchen.addExit("east", doorKLr); livingRoom.addExit("west",doorKLr); 
        Door doorBLr = new Door (bedroom, livingRoom); livingRoom.addExit("east",doorBLr); bedroom.addExit("west",doorBLr);
        Item keyLivingStreet = new Item("home key", "this key opens the door to exit the master's house",0);
        LockedDoor doorS1Lr = new LockedDoor (keyLivingStreet, street1, livingRoom); livingRoom.addExit("south",doorS1Lr);street1.addExit("north",doorS1Lr);
        Door doorS2S1 = new Door (street2, street1);street1.addExit("east",doorS2S1); street2.addExit("west",doorS2S1);
        Door doorSS1 = new Door (sewer, street1);street1.addExit("down",doorSS1);sewer.addExit("up",doorSS1);
        Door doorPS2 = new Door (petshop, street2);street2.addExit("south",doorPS2);petshop.addExit("north",doorPS2);
        Door doorSS2 = new Door (sewer, street2);street2.addExit("down",doorSS2);sewer.addExit("up",doorSS2);
        Door doorGdP = new Door (theGreatDescent, petshop);petshop.addExit("down", doorGdP);theGreatDescent.addExit("up",doorGdP);
        Door doorDGd = new Door (dory, theGreatDescent);theGreatDescent.addExit("west",doorDGd); dory.addExit("east",doorDGd);
        Door doorFpGd = new Door (theFishPalace, theGreatDescent);theGreatDescent.addExit("down",doorFpGd);theFishPalace.addExit("up",doorFpGd);
        Item keyFishTavern = new Item ("blue key","This key opens the door between the fish palace and the San Ricardo tavern",0);
        LockedDoor doorFpTsr = new LockedDoor (keyFishTavern, theFishPalace, tavernSanRicardo);tavernSanRicardo.addExit("north", doorFpTsr); theFishPalace.addExit("south", doorFpTsr);
        Door doorSwTsr = new Door (starWars, tavernSanRicardo);tavernSanRicardo.addExit("up", doorSwTsr); starWars.addExit("down",doorSwTsr);
        Door doorCSw = new Door (theCloset,starWars);starWars.addExit("east",doorCSw);theCloset.addExit("west",doorCSw);
        Door doorEC = new Door (theEnd, theCloset);theCloset.addExit("south", doorEC);
        
        currentRoom = livingRoom;  // start game in master's house
    }

    /*
     * Create all the items in the game
     */
    private void createItems()
    {
        Item potion = new Item ("potion","It's nice and warm",1);
        Item jaw = new Item ("jaw","It's sharp and ready",5);
        Item superPiss = new Item ("superPiss","Wow it's dirty",8);
    }
    
    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }
    
    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println("You are " + currentRoom.getDescription());
        currentRoom.printExits();
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help"))
            printHelp();
        else if (commandWord.equals("go"))
            goRoom(command);
        else if (commandWord.equals("quit"))
            wantToQuit = quit(command);
        else if (commandWord.equals("look"))
            lookRoom(command);

        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        System.out.println("   go quit help");
    }
    
    /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();
        
        // Try to leave current room.
        Door nextDoor = currentRoom.getNextRoom(direction);
        if (nextDoor instanceof LockedDoor){
            LockedDoor l = (LockedDoor)nextDoor;
            l.openLockedDoor(MrKitten.getInventory(),currentRoom);
        }
        else{
        try{
            Room nextRoom = nextDoor.getRoom(currentRoom);
            currentRoom = nextRoom;
            System.out.println("You " + currentRoom.getDescription());
            currentRoom.printExits();
        }
        catch (Exception e){
            System.out.println("Wrong direction!");
            System.out.println("You " + currentRoom.getDescription());
            System.out.println("You can go :");
            currentRoom.printExits();
        }
    }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    
    /*
     * You can look into the room to see the description of the room or to describe an item
     */
    private void lookRoom(Command command)
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we describe the current room 
            System.out.println("You " + currentRoom.getDescription());
            currentRoom.printExits();
        }
        else {
            String itemName = command.getSecondWord();
            Players.getItemDescription(itemName);
        }
    }
    
    
    /*
     * You can fight peoples in the current room  
     */
    private void fightPeople(Command command)
    { 
          ennemi = "Dory"; // REGARDER LA DESCRIPTION DES ROOM POUR VOIR QUI EST LA
          int ennemiHP = 25; // REGARDER LA DESCRIPTION DES ACTEURS
          int ennemiAD = 10; // REGARDER  LA DESCRIPTION DES ACTEURS
          int MrKittenHP = 120; // REGARDER LA DESCRIPTION DE MR KITTEN
          System.out.println ("Mr Kitten VS "+ ennemi);
          while (MrKittenHP>0 || ennemiHP>0){
            int intEnnemiHP = ennemiHP;
            while(intEnnemiHP == ennemiHP) {
                System.out.println (" What would you like ? attack / special attack / items");
                intEnnemiHP = fightCommand(command,ennemiHP);
            }
            ennemiHP = intEnnemiHP;
            Random nbRd = new Random();
            int nextnb = nbRd.nextInt(ennemiAD)+1;
            MrKittenHP =  MrKittenHP - nextnb;        
          }
        
    }
    /**
     * Give a command to fight
     */
    private int fightCommand(Command command, int ennemiHP) 
    {
        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return ennemiHP;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("attack")){
            ennemiHP = attack(ennemiHP);
        }
        else if (commandWord.equals("special attack")){
            ennemiHP = specialAttack(ennemiHP);
        }
        else if (commandWord.equals("items")){
            ennemiHP = items(ennemiHP);
        }
         
        return ennemiHP;
    }
    /**
     * Reduce ennemi HP by a normal attack
     */
    private int attack (int ennemiHP)
    {
        Random nbRd = new Random();
        int nextnb = nbRd.nextInt(7)+1;
        ennemiHP = ennemiHP - nextnb;
     
        return ennemiHP;
    }
    
     /**
     * Choose a special attack
     */
    private int specialAttack(int ennemiHP)
    {
        System.out.println(" What would you like ? ");
        for (int i = 0;i<inventory.size();i++){
            Item currentItem = inventory.get(i);
            if (currentItem.getName().equals("superPiss")){
                System.out.println(" superPiss ");
            }
            if (currentItem.getName().equals("superBite")){
                System.out.println(" superBite ");
            }
            if (currentItem.getName().equals("laserTail")){
                System.out.println(" laserTail ");
            }
        }
        ennemiHP = specialCommand(command,ennemiHP);
        return ennemiHP;
    }
    
    /**
     * Reduce ennemi HP by a special attack
     */
    private int specialCommand(Command command, int ennemiHP)
    {
        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return ennemiHP;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("superPiss")){
            ennemiHP = ennemiHP - 15;
        } else if (commandWord.equals("superBite")){
            ennemiHP = ennemiHP - 20;
        } else if (commandWord.equals("laserTail")){
            ennemiHP = ennemiHP - 25;
        }
        
        return ennemiHP;
    }
    
}
