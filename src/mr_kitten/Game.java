package mr_kitten;


import java.util.Random;
import java.util.*;
import java.io.*; 

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
    private static ArrayList<Item> items;
    private static ArrayList<Characters> characters;
    
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
     * Gettor to access list of items and list of characters
     * @return 
     */
    public static ArrayList<Item> getListItem(){
        return items;
    }
    
    public static ArrayList<Characters> getListCharacters(){
        return characters;
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
        Characters garfield = new Characters("Garfield", 30, 5,"...", "street1");
        Characters strayCat = new Characters("strayCat", 20, 5,"...", "street2");
        Characters splinter = new Characters("Splinter", 25, 15,"niark niark niark", "sewer");
        Characters dory = new Characters("Dory", 25, 5,"Blablablabla", "dory");//A COMPLETER
        Characters ratatouille = new Characters("Ratatouille", 20, 5,"...", "petshop");
        Characters mrRobot = new Characters("Mr.Robot", 40, 25,"", "petshop");
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
        characters.add(strayCat);
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
        else if(commandWord.equals("explore")){
            exploreRoom();
        }
        else if(commandWord.equals("inventory")){
            inventory();
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
        System.out.println("   go quit fight talk explore inventory help  ");
        System.out.println("go + direction -- deplace in the map");
        System.out.println("quit -- quit the game");
        System.out.println("fight -- fight a characters");
        System.out.println("explore -- explore the room and realize actions");
        System.out.println("inventory -- print your inventory of item");
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
            Room nextRoom = nextDoor.getRoom(currentRoom);
            currentRoom = nextRoom;
            System.out.println("You " + currentRoom.getDescription());
            currentRoom.printExits();
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
                break;
            }
        }  
        if (charactersFind == false) {
            System.out.println("There is no character in this room");
        }
        else {
            if (ennemi.equals("mrRobot")){
                Actors.mrRobotDialog();
            }
            int MrKittenHP = MrKitten.getPlayerHP();
            System.out.println("Mr Kitten VS "+ ennemi);
            while (MrKittenHP>0 && ennemiHP>0){
                    System.out.println("    *********   ");
                    System.out.println("Mr.Kitten's HP = "+MrKittenHP);
                    System.out.println(ennemi+"'s HP = "+ennemiHP);
                    System.out.println("    *********   ");
                    System.out.println (" What would you like ? ");
                    System.out.println(" a - attack ");
                    System.out.println(" b - special attack ");
                    System.out.println(" c - items");
                    System.out.println(" Enter the character please :");
                    Scanner keyboard = new Scanner(System.in);
                    String answer = keyboard.nextLine();
                    switch (answer){
                        case "a": {
                            ennemiHP=attack(ennemiHP);
                            };break;
                        case "b": {
                            ennemiHP=specialAttack(ennemiHP);
                            };break;
                        case "c": {
                            MrKittenHP=itemsAttack(MrKittenHP);
                            };break;
                        default:  System.out.println("what the hell did you just say? You are fighting, you take dommage"); break;
                    }
                if(ennemiHP >0){
                    Random nbRd = new Random();
                    int nextnb = nbRd.nextInt(ennemiAD)+1;
                    MrKittenHP =  MrKittenHP - nextnb;
                }
            }
            if (ennemiHP <= 0){
                System.out.println("You win !!! It remains "+MrKittenHP+" HP");
                Players.setPlayerHP(MrKittenHP);
            }else {
                System.out.println("You loose !! GAME OVER !!");
                System.exit(1);              
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
        boolean specialAttack = false;
        System.out.println(" What would you like ? ");
        for (int i = 0;i<MrKitten.getInventory().size();i++){
            Item currentItem = MrKitten.getInventory().get(i);
            if (currentItem.getName().equals("superPiss")){
                System.out.println(" a - superPiss ");
                specialAttack = true;
            }
            if (currentItem.getName().equals("superBite")){
                System.out.println(" b - superBite ");
                specialAttack = true;
            }
            if (currentItem.getName().equals("puppyEyes")){
                System.out.println(" c - puppyEyes ");
                specialAttack = true;
            }
            if (currentItem.getName().equals("laserTail")){
                System.out.println(" d - laserTail ");
                specialAttack = true;
            }
        }
        if(specialAttack == true){
            System.out.println(" Enter the character please :");
            Scanner keyboard = new Scanner(System.in);
            String answer = keyboard.nextLine();
            switch (answer){
                case "a": {
                    ennemiHP=ennemiHP-15;
                };break;
                case "b": {
                    ennemiHP=ennemiHP-20;
                };break;
                case "c": {
                    ennemiHP=ennemiHP-25;
                };break;
                case "d": {
                    ennemiHP=ennemiHP-30;
                };break;
                default:  System.out.println("what the hell did you just say? You are fighting, you take dommage"); break;
            }
        }else {
            System.out.println("You have no special attack...");
        }
        return ennemiHP;
    }
    
    /**
     * Chosse an items in your inventory
     */
    private int itemsAttack(int playerHP)
    {
        boolean itemsAttack = false;
        System.out.println(" What would you like to add your HP ? ");
        for (int i = 0;i<MrKitten.getInventory().size();i++){
            Item currentItem = MrKitten.getInventory().get(i);
            if (currentItem.getName().equals("potionCareMin")){
                System.out.println(" a - potionCareMin (+30HP) ");
                itemsAttack = true;
            }
            if (currentItem.getName().equals("potionCareMax")){
                System.out.println(" b - potionCareMax (+120HP)");
                itemsAttack = true;
            }
            if (currentItem.getName().equals("potionCareMean")){
                System.out.println(" c - potionCareMean (+60HP)");
                itemsAttack = true;
            }
            if (currentItem.getName().equals("algea")){
                System.out.println(" d - algea (+35HP)");
                itemsAttack = true;
            }
            if (currentItem.getName().equals("potionBonus")){
                System.out.println(" e - potionBonus (+100HP)");
                itemsAttack = true;
            }
        }
        if(itemsAttack == true){
            System.out.println(" Enter the character please :");
            Scanner keyboard = new Scanner(System.in);
            String answer = keyboard.nextLine();
            switch (answer){
                case "a": {
                    playerHP=playerHP+30;
                    MrKitten.useItem("potionCareMin");
                };break;
                case "b": {
                    playerHP=playerHP+120;
                    MrKitten.useItem("potionCareMax");
                };break;
                case "c": {
                    playerHP=playerHP+60;
                    MrKitten.useItem("potionCareMean");
                };break;
                case "d": {
                    playerHP=playerHP+35;
                    MrKitten.useItem("algea");
                };break;
                case "e": {
                    playerHP=playerHP+100;
                    MrKitten.useItem("potionBonus");
                };break;
                default:  System.out.println("what the hell did you just say? You are fighting, you take dommage"); break;
            }
            if(playerHP >120){
                playerHP = 120;
            }
        }else{
            System.out.println("You have no items to care...");
        }
        return playerHP;
    }
    
    private void talkRoomPeople(){
        if (currentRoom.getName().equals("dory")){
            System.out.println("DORY :");
            Actors.doryDialogue();return;
        }
        else if (currentRoom.getName().equals("petshop")){
            System.out.println("RED FISH :");
            Actors.redFishDialog();return;
        }
        else {
            for (int i=0;i < characters.size();i++){
                Characters currentChar = characters.get(i);
                if (currentChar.getRoom().equals(currentRoom.getName())){
                    System.out.println(currentChar.getName()+":");
                    System.out.println(currentChar.getTalk());return;
                }
            }
        }
    }
    
    private void exploreRoom(){
        int MrKittenHP = MrKitten.getPlayerHP();
        Scanner keyboard = new Scanner(System.in);
        switch(currentRoom.getName()){
            case "livingRoom" :
                System.out.println("This couch is where the master always crashes... Let's do something!");
                System.out.println("Destroy the couch?");
                System.out.println("a - Yes he deserves it!");
                System.out.println("b - No! I may be a little dizzy but I won't turn crazy today!");
                System.out.println("Enter the character please :");
                String answer = keyboard.nextLine();
                if (answer.equals("a")){
                    System.out.println("You totaly nailed it! But you noticed that a key droped on the floor... What could it be?!");
                    MrKitten.grabItem("home key");
                }
                else {
                    System.out.println("Pussycat! Without some balls you won't go to any places!");
                }
                try {
                    Thread.sleep(2000);
                }
                catch (Exception e) {
                    System.out.println("Bizarre que ça marche pas...");
                }
                System.out.println("Need to do something else...");
                System.out.println("Oh! A goldfish! Seems tasty...");
                System.out.println("Eat it?");
                System.out.println(" a - Yes!");
                System.out.println(" b - With a bit of mayonnaise... What could happen?");
                System.out.println("Enter the character: ");
                answer = keyboard.nextLine();//Not usefull since he doesn't really have any choice
                System.out.println("Hum... Yum!");
                break;
            case "kitchen" :System.out.println ("Best place of the world for all cordon bleu. Their is always something to eat.");
                System.out.println("It's smelling cooking food ! The kitchen table is probably full of food." 
                        + "Do you want jump on the kitchen table ?"
                        + "a - Oh god YES ! I'm hungry guys !"
                        + "b - No, it's better on the kitchen cupboard");
                String answer_kitchen = keyboard.nextLine();
                if (answer_kitchen.equals("a")){
                    System.out.println("Oohh, you're sad :( Their is only the half salt butter but it work. You eat it and gain 25 hp !");
                    MrKittenHP =MrKittenHP +25;  
                    Players.setPlayerHP(MrKittenHP);
                }
                else {
                    System.out.println("Jackpot ! A cooked fish is on this cupboard. You eat it and gain 50 hp !");
                     MrKittenHP =MrKittenHP +50;
                    Players.setPlayerHP(MrKittenHP);
                }
                    if(MrKittenHP >120){
                        MrKittenHP = 120;
                        Players.setPlayerHP(MrKittenHP);
                    }
                break;
                
            case "bedroom" : break;
            case "street1" :
                System.out.println("You look around you and see a big old cat on the street, coming toward you.");
                System.out.println("He looks friendly and comes near you.");
                System.out.println("You may want to talk to him");
                System.out.println("There is also a garbage can over here, it smells delicious...");
                System.out.println("What do you want to do?");
                System.out.println("a - talk to the cat");
                System.out.println("b - explore the garbage can");
                answer = keyboard.nextLine();
                if (answer.equals("a")){
                Actors.garfieldDialog();   
                }
                else if (answer.equals("b")){
                System.out.println("You found a healing potion! That might be useful...");
                MrKitten.grabItem("potionCareMin");
                }
                break;
            case "street2" :
                System.out.println("Here you are! Back in the light!");
                System.out.println("There is another garbage can! Sounds like you are going to make a good deal again!");
                System.out.println("do you want to explore the garbage can?");
                System.out.println("a - yes");
                System.out.println("b - no");
                answer = keyboard.nextLine();
                if (answer.equals("a")){
                System.out.println("Uh-Oh! There is already someone in this garbage can!");
                System.out.println("This stray cat doesn't look soft!");
                fightPeople();
                }
                else if (answer.equals("b")){
                System.out.println("Let us hope you will not regret it...");
                }
                break;
            case "sewer" : 
                System.out.println("Look! A wild rat is coming toward you!");
                System.out.println("It seems you have entered his territory");
                fightPeople();
                MrKitten.grabItem("superPiss");
                System.out.println("Congratulations! You have learned a new ability : SuperPiss");
                System.out.println("You are now able to pee on people in a...deadly way...");
                break;
            case "petshop" : 
                System.out.println("A red fish appears! He looks stern...");
                Actors.redFishDialog();
                System.out.println("There is a rat in one of the cages. He looks different from the other rats...wise.");
                System.out.println("Do you want to talk to him?");
                System.out.println("a - yes");
                System.out.println("b - no");
                answer = keyboard.nextLine();
                if (answer.equals("a")){
                Actors.ratatouilleDialog();
                System.out.println("Congratulations! You just learned Alchemy! You are now able to craft objects using this principle.");
                }
                else if (answer.equals("b")){
                System.out.println("Let us hope you will not regret it...");
                }
                System.out.println("Sheeiiiiiit! You woke up the tyran of the petshop, the robot cleaner!");
                Actors.mrRobotDialog();
                fightPeople();
                MrKitten.grabItem("potionCareMean");
                System.out.println("The robot has dropped a potion. Will you make good use of it?");
                break;
            case "theGreatDescent" : break;
            case "dory" : break;
            case "theFishPalace" : break;
            case "tavernSanRicardo" : break;
            case "starWars" : break;
            case "theCloset" : break;
            case "theEnd" : break;
            default : System.out.println("Just... how??"); break;
        }
    }
    
    private void inventory(){
        MrKitten.printInventory();
    }
}
