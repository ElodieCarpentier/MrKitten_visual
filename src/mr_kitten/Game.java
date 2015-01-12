package mr_kitten;


import java.util.Random;
import java.util.*;

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
    private ArrayList<Item> items;
    private ArrayList<Characters> characters;
    
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        items = new ArrayList<Item>();
        characters = new ArrayList<Characters>();
        MrKitten = new Players("Mr.Kitten");
        parser = new Parser();
        createRooms();
        createItems();
        createCharacters();
     }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        //Declare rooms;
        Room kitchen,livingRoom,bedroom,street1,street2,sewer,petshop,theGreatDescent,dory,theFishPalace;
        Room tavernSanRicardo,starWars,theCloset,theEnd;
                
        kitchen = new Room ("are in the Kitchen of the Master's house","kitchen");
        livingRoom = new Room ("are in the Living room of the Master's house","livingRoom");
        bedroom = new Room ("are in the Bedroom of the Master's house","bedroom");
        street1 = new Room ("are in the Street near the entrance of the house","street1");
        street2 = new Room ("are in the Street near the Petshop","street2");
        sewer = new Room ("are in the Sewer under the streets","sewer");
        petshop = new Room ("are in the Petshop","petshop");
        theGreatDescent = new Room ("are going deep down under water","theGreatDescent");
        dory = new Room ("are with Dory the great fish","dory");
        theFishPalace = new Room ("are in the Fish Palace","theFishPalace");
        tavernSanRicardo = new Room ("are in the magnificient Tavern Of San Ricardo","tavernSanRicardo");
        starWars = new Room ("are in a Galaxy far far away...","starWars");
        theCloset = new Room ("are ready to fight with lions","theCloset");
        theEnd = new Room ("did it, you did it, Yeah!","theEnd");
        
        //Declare doors and items
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
        Item potionCareMin = new Item ("potionCareMin","This potion heals you for a small amount of your health",5);
        Item potionCareMax = new Item ("potionCareMax","This potion heals you for a big amount of your health",25);
        Item potionCareMean = new Item("potionCareMean","This potion heals you for a medium amount of your health",20);
        Item algea = new Item ("algea", "This algae has revitalizing properties. It can heal wounds and restore a medium amount of your health.", 10); //A COMPLETER
        Item potionBonus = new Item("potionBonus", "This potion heals you for a big amount of your health", 25); //A COMPLETER
        Item superBite = new Item ("superBite","It's sharp and ready to rip your opponents' heads off",10);
        Item superPiss = new Item ("superPiss","Wow it's dirty",8);
        Item puppyEyes = new Item ("puppy eyes", "Use this look to charm anyone", 13);
        Item laserTail = new Item ("laser tail", "May the catnip be with you, young Catawan.", 20);
        items.add(potionCareMin);
        items.add(potionCareMax);
        items.add(potionCareMean);
        items.add(algea);
        items.add(potionBonus);
        items.add(superBite);
        items.add(superPiss);
        items.add(puppyEyes);
        items.add(laserTail);
        Item keyLivingStreet = new Item("home key", "this key opens the door to exit the master's house",0);
        items.add(keyLivingStreet);
        Item keyFishTavern = new Item ("blue key","This key opens the door between the fish palace and the San Ricardo tavern",0);
        items.add(keyFishTavern);
    }
    
    /**
     * Create all characters in the game
     */
    public void createCharacters() {
        Characters goldFish = new Characters("Gold Fish", 10, 3,"Blub blub blub blob. Please don't kill me.", "livingRoom");
        Characters garfield = new Characters("Garfield", 30, 5,"Hey buddy...What are you carrying there?"
                + "Oh my...Is that the ancient Cat book? Are you a descendant of the Ancients?"
                + "You look pretty young. I bet you do not know our race story."
                + "Long ago, the ancient Cats were very powerful. But today, they have almost disappeared."
                + "Today, only small, dumb and domesticated cats remain."
                + "Humans made us their pets, can you believe that? They torn families apart, sell our babies to stranger. They kill the free cats that live on the street. These nasty humans even cut some of us when they don't want us to reproduce and have a family."
                + "I know this is shocking, but it is the truth.", "street1");
        Characters splinter = new Characters("Splinter", 25, 15,"Mr Kitten,"
                + "I am here to inform you that the King of the Waterworld summons you to the underwater court."
                + "You will be judged for the murder of one of our beloved citizens, an honest goldfish who used to live in the same house you did."
                + "We expect your presence in the court in 3 water days, or else you will be hunted down and executed for your crimes.", "street2");
        Characters dory = new Characters("Dory", 25, 5,"...", "dory");//A COMPLETER
        Characters ratatouille = new Characters("Ratatouille", 20, 5,"Hello, young cat. I have heard of you. I think you could use some help in your quest."
                + "I can teach you something, and I hope you will make good use of it. I also hope that this action will unite the Cats and Rats race for a very long time."
                + "I have a dream that our txo races can live together peacefully.", "petshop");
        Characters mrRobot = new Characters("Mr.Robot", 40, 25,"Bip Beep Bop, stranger detected. Beep beep, danger incoming"
                + "Must..destroy..."
                + "The danger..."
                + "Beep...", "petshop");
        Characters shark = new Characters("Sharks", 20, 10,"Look at that Bruce! A furry fish! We have to taste that. Prepare to die!", "theGreatDescent");//A COMPLETER
        Characters darkMoule = new Characters("Dark Moule", 35, 20, "Who do you think you are?!"
                + "You cannot prevail, you silly kitty..."
                + "I will crush you!", "theFishPalace");
        Characters pussInBoots = new Characters("Puss in boots", 25, 15,"Hola, Senor Gato!"
                + "I see you come from the portal. It has been a long time since it has been used! By another cat that looks like yoy, by the way..."
                + "I have heard about your quest, and I want you to know that I support you!"
                + "Let me teach you something that could be of a great help, for this quest and for all your life...", "tavernSanRicardo");
        Characters darkVador = new Characters("Dark Vador", 40, 25,"Shhhh...Shhhh...Are you a rebel? You look like a strange Ewok..."
                + "Anyway, no one can enter a colonized planet like this! I will execute you!", "star wars");//A COMPLETER
        Characters brother = new Characters("Brother", 50, 30,"So, here you are...brother. I have been waiting for you."
                + "Do not look so suprised! I am an Ancient Cat, just like you."
                + "When I first heard about the magical Guillotine, I knew I was the only one who could use it."
                + "And you, you want to take it, and spread power amongst these dumb kitties!"
                + "This would only lead us to chaos...But if you join me, we could rule the world, together!"
                + "You don't want to?... You are just like Mom and Dad, to blind and stupid to see what's right!"
                + "I will never let you take it!", "theEnd");
    
        characters = new ArrayList<Characters>();
        characters.add(goldFish);
        characters.add(garfield);
        characters.add(splinter);
        characters.add(dory);
        characters.add(ratatouille);
        characters.add(mrRobot);
        characters.add(shark);
        characters.add(darkMoule);
        characters.add(pussInBoots);
        characters.add(darkVador);
        characters.add(brother);
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
        if(commandWord.equals("help")){
            printHelp();
        }    
        else if(commandWord.equals("go")){
            goRoom(command);
        }    
        else if(commandWord.equals("quit")){
            wantToQuit = quit(command);
        }
        else if(commandWord.equals("look")){
            lookRoom(command);
        }
        else if(commandWord.equals("fight")){
            fightPeople();
        }
        else if(commandWord.equals("talk")){
            talkRoomPeople();
        }
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
    private void fightPeople()
    { 
        String ennemi = "";
        int ennemiHP=0;
        int ennemiAD=0;
        boolean charactersFind = false;
        for (int i = 0;i<characters.size();i++){
            Characters currentChar = characters.get(i);
            if (currentChar.getRoom().equals(currentRoom.getName())) {
                ennemi = currentChar.getName();
                ennemiHP = currentChar.getEnnemiHP();
                ennemiAD = currentChar.getEnnemiAD();
                charactersFind = true;
                return;
            }
        }  
        if (charactersFind == false) {
            System.out.println("There is no character in this room");
        }
        else {
            int MrKittenHP = MrKitten.getPlayerHP();
            System.out.println ("Mr Kitten VS "+ ennemi);
            while (MrKittenHP>0 || ennemiHP>0){
                    System.out.println (" What would you like ? ");
                    System.out.println(" a - attack ");
                    System.out.println(" b - special attack ");
                    System.out.println(" c - items");
                    System.out.println(" Enter the character please :");
                    Scanner keyboard = new Scanner(System.in);
                    String answer = keyboard.nextLine();
                    switch (3){
                    case 1: if (answer.equals("a")){
                        ennemiHP=attack(ennemiHP);
                        };break;
                    case 2: if (answer.equals("b")){
                        ennemiHP=specialAttack(ennemiHP);
                        };break;
                    case 3: if (answer.equals("c")){
                        MrKittenHP=itemsAttack(MrKittenHP);
                        };break;
                    default:  System.out.println("what the hell did you just say?"); break;
                    }
                Random nbRd = new Random();
                int nextnb = nbRd.nextInt(ennemiAD)+1;
                MrKittenHP =  MrKittenHP - nextnb;        
            }
        }
    }
    /**
     * Reduce ennemi HP by a normal attack
     */
    public int attack (int ennemiHP)
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
        for (int i = 0;i<MrKitten.getInventory().size();i++){
            Item currentItem = MrKitten.getInventory().get(i);
            if (currentItem.getName().equals("superPiss")){
                System.out.println(" a - superPiss ");
            }
            if (currentItem.getName().equals("superBite")){
                System.out.println(" b - superBite ");
            }
            if (currentItem.getName().equals("puppyEyes")){
                System.out.println(" c - puppyEyes ");
            }
            if (currentItem.getName().equals("laserTail")){
                System.out.println(" d - laserTail ");
            }
        }
        System.out.println(" Enter the character please :");
        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.nextLine();
        switch (4){
            case 1: if (answer.equals("a")){
                ennemiHP=ennemiHP-15;
            };break;
            case 2: if (answer.equals("b")){
                ennemiHP=ennemiHP-20;
            };break;
            case 3: if (answer.equals("c")){
                ennemiHP=ennemiHP-25;
            };break;
            case 4: if (answer.equals("d")){
                ennemiHP=ennemiHP-30;
            };break;
            default:  System.out.println("what the hell did you just say?"); break;
        }
        return ennemiHP;
    }
    
    /**
     * Chosse an items in your inventory
     */
    private int itemsAttack(int playerHP)
    {
        System.out.println(" What would you like to add your HP ? ");
        for (int i = 0;i<MrKitten.getInventory().size();i++){
            Item currentItem = MrKitten.getInventory().get(i);
            if (currentItem.getName().equals("potionCareMin")){
                System.out.println(" a - potionCareMin ");
            }
            if (currentItem.getName().equals("potionCareMax")){
                System.out.println(" b - potionCareMax ");
            }
            if (currentItem.getName().equals("potionCareMean")){
                System.out.println(" c - potionCareMean ");
            }
            if (currentItem.getName().equals("algea")){
                System.out.println(" d - algea ");
            }
            if (currentItem.getName().equals("potionBonus")){
                System.out.println(" e - potionBonus ");
            }
        }
        System.out.println(" Enter the character please :");
        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.nextLine();
        switch (5){
            case 1: if (answer.equals("a")){
                playerHP=playerHP+30;
            };break;
            case 2: if (answer.equals("b")){
                playerHP=playerHP+120;
            };break;
            case 3: if (answer.equals("c")){
                playerHP=playerHP+60;
            };break;
            case 4: if (answer.equals("d")){
                playerHP=playerHP+35;
            };break;
            case 5: if (answer.equals("e")){
                playerHP=playerHP+100;
            };break;
            default:  System.out.println("what the hell did you just say?"); break;
        }
        return playerHP;
    }
    
    private void talkRoomPeople(){
        if (currentRoom.equals("dory")){
            Actors.doryDialogue();
        }
        else {
            for (int i=0;i < characters.size();i++){
                Characters currentChar = characters.get(i);
                if (currentChar.getRoom().equals(currentRoom.getName())){
                    System.out.println(currentChar.getTalk());
                }
            }
        }
    }
}
