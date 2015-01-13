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
    
     
    public static String redFishDialog(){
        String redFish = ("Mr Kitten, \n"
                +"\n I am here to inform you that the King of the Waterworld summons you to the underwater court.\n"
                +"\n You will be judged for the murder of one of our beloved citizens, an honest goldfish who used to live in the same house you did."
                +"\n We expect your presence in the court in 3 water days, or else you will be hunted down and executed for your crimes. \n");
        return redFish;
    }
    
    public static String ratatouilleDialog(){
        String ratatouille =("Hello, young cat. I have heard of you. I think you could use some help in your quest."
                + "\n I can teach you something, and I hope you will make good use of it. I also hope that this action will unite the Cats and Rats race for a very long time."
                + "\n I have a dream that our txo races can live together peacefully.");
        return ratatouille;
    }
    
    public static String mrRobotDialog(){
        String robotDialog = ("Bip Beep Bop, stranger detected. Beep beep, danger incoming"
                + "\n Must..destroy..."
                + "\n The danger..."
                + "\n Beep...");
        return robotDialog;
    }
    
    public static String garfieldDialog(){
    String garfield =("Hey buddy...What are you carrying there? \n"
            +"\n Oh my...Is that the ancient Cat book? Are you a descendant of the Ancients? \n"
            +"\n You look pretty young. I bet you do not know our race story.\n"
            +"\n Long ago, the ancient Cats were very powerful. But today, they have almost disappeared.\n"
            +"\n Today, only small, dumb and domesticated cats remain.\n"
            +"\n Humans made us their pets, can you believe that? They torn families apart, sell our babies to stranger. \n They kill the free cats that live on the street. These nasty humans even cut some of us when they don't want us to reproduce and have a family.\n"
            +"\n I know this is shocking, but it is the truth.\n ");
        return garfield;
    }
    
    public static String sharkDialog(){
        String shark= ("Look at that Bruce! A furry fish! We have to taste that. Prepare to die!");
        return shark;
    }
    
    public static void darkMouleDialog(){
        System.out.println("Who do you think you are?!");
        System.out.println("You cannot prevail, you silly kitty...");
        System.out.println("I will crush you!");
    }
    
    public static void pussInBootsDialog(){
        System.out.println("Hola, Senor Gato!");
        System.out.println("I see you come from the portal. It has been a long time since it has been used! By another cat that looks like yoy, by the way...\"");
        System.out.println("I have heard about your quest, and I want you to know that I support you!");
        System.out.println("Let me teach you something that could be of a great help, for this quest and for all your life...");
    }
    
    public static void brotherDialog(){
        System.out.println("So, here you are...brother. I have been waiting for you.");
        System.out.println("Do not look so suprised! I am an Ancient Cat, just like you.");
        System.out.println("When I first heard about the magical Guillotine, I knew I was the only one who could use it.");
        System.out.println("And you, you want to take it, and spread power amongst these dumb kitties!");
        System.out.println("This would only lead us to chaos...But if you join me, we could rule the world, together!");
        System.out.println("You don't want to?... You are just like Mom and Dad, to blind and stupid to see what's right!");
        System.out.println("I will never let you take it!");
    }
     public static void vadorDialog_a() {
        System.out.println("Oh well ! A new visitor in my house. Do you know where you are ?");
        System.out.println("Because I'm the answer to all your questions indeed I'm in the darkside where all is possible ! Ahahah !");
        System.out.println("I can propose to you a nice offer. A full time job in the darkside coorporation !");
    }
    
    public static void vadorDialog_b() {
        System.out.println("What ?! You can't refuse this offer !!");
        System.out.println("Let's fight and see my superiority !!");
    }
    
    public static String doryDialog_intro (){
        String dory=("You got a problem buddy?! Wait, did I just said that? Oh, I just met you,"
                + "\n and this is crazy, but here's my number. Hey how is it going mate?"
                + "\n Oh I might need your help! Do you know where Marin is going?"
                + "\n     a - P. Sherman Wallaby Way in Sydney Bitch!"
                + "\n     b - Somewhere only we know <3"
                + "\n     c - I heard something that my cousin told me about a women he was seeing in some places"
                + "\n and that she was sometimes refering to someone as Marin, but i don't know if that's him because my dad also told me she was"
                + "\n pretty crazy but as my mom said, never trust a man that can't even scratch a butterfly."
                + "\n     d - answer d"
                + "\n Enter the character please :");
        return dory;
    }
    
    public static String doryDialog_good(){
        String dorygood=("I also remember that I have a History test tomorrow!"
                + "\n You gotta help me! Just remember me which animal is"
                + "\n the great defender of the world!"
                + "\n     a - Superman! Have you seen his underwear? So much red!"
                + "\n     b - Magicarpe! Obviously this magesterial fish! And he is red too!"
                + "\n     c - Etalon du cul! What a french name for a true hero! "
                + "\n     d - Do you really want the D?"
                + "\n Enter the character please :");
        return dorygood;
    }
}
