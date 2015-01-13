/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mr_kitten;

/**
 *
 * @author Charles
 */
public class ExpInfo {
     protected static String printanswerError(){
      String   answerError = ("/n Bizarre que ça ne marche pas...");
      return answerError;
    }
    
     protected static String printdeathMessage(){
         String deathMessage = ("You loose !! GAME OVER !!");
         return deathMessage;
     }
    /**
     * Print of living room
     * @return 
     */
    protected static String printlivingRoom_intro(){
            String intro = ("This couch is where the master always crashes... Let's do something!\n"
                + "\n Destroy the couch?"
                + "\n    a - Yes he deserves it!"
                + "\n    b - No! I may be a little dizzy but I won't turn crazy today!"
                + "\n Enter the character please :");
        return intro; 
    }

    protected static String printlivingRoom_answerA(){
       String answerA = ("/n You totaly nailed it! But you noticed that a key droped on the floor... What could it be?!");
       return answerA; 
    }
    
    protected static String printlivingRoom_answerB(){
       String answerB = ("/n Pussycat! Without some balls you won't go to any places!");
       return answerB; 
    }
    
    protected static String printlivingRoom_conclu(){
            String conclu = ("Need to do something else...\n"
                + "\n Oh! A goldfish! Seems tasty..."
                + "\n Eat it?"
                + "\n     a - Yes!"
                + "\n     b - With a bit of mayonnaise... What could happen?"
                + "\n Enter the character: ");
        return conclu; 
    }
    
    protected static String printlivingRoom_end(){
       String end = ("/n Hum... Yum!");
       return end; 
    }
    
    /**
     * Print of kitchen 
     */
    protected static String printKitchen_intro(){
        String intro =("Best place of the world for all cordon bleu. Their is always something to eat. \n"
                +"\n It's smelling cooking food ! The kitchen table is probably full of food.\n"
                +"\n Do you want jump on the kitchen table ?\n"
                +"\n    a - Oh god YES ! I'm hungry guys !\n"
                +"\n    b - No, it's better on the kitchen cupboard\n"
                +"\n Enter the character please :\n");
        return intro;
    }
    
    protected static String printKitchen_answerA(){
        String answerA =("\n Oohh, you're sad :( Their is only the half salt butter but it work. You eat it and gain 25 hp !");
        return answerA;            
    }
    
    protected static String printKitchen_answerB(){
        String answerB =("\n Jackpot ! A cooked fish is on this cupboard. You eat it and gain 50 hp !");
        return answerB;            
    }
    
    
    /**
     * Print of bedroom
     */
    protected static String printbedroom_intro(){
        String intro = ("The master isn't here. It's a great opportunity to discover this unknow room."
                + "\n Their is soo many things to play with, you can't wait to act with :"
                + "\n a - The bed: A nice castle for a super cat like me and a beautifull pillow with feathers;"
                + "\n b - The chest of drawers: I will improve my climbing skill and i could roll out some ball;"
                + "\n c - The library: So many books well ordered, a great slalom to improve my dexterity;"
                + "\n d - The new chair: I could mad my claws and relax myself. "
                + "\n Enter the character please :");
        return intro;
    }
    
    protected static String printbedroom_answerA(){
        String answerA = ("Oohh, you're so exited to play in your castle and after ripped the pillow you eat accidently a feather. "
                + "\n You loose 5 hp.");
        return answerA;
    }
    
    protected static String printbedroom_answerB(){
        String answerB = ("It's not easy to reach the chest. You're on the top but drawers are locked with a key. "
                + "\n Nothing else !");
        return answerB;
    }
    
    protected static String printbedroom_answerC(){
        String answerC = ("You're climbing the library unfortunately you're falling but a pillow soften this fall. Are you enought brave to retry ?"
                + "\n     a- No thanks, it's too dangerous !"
                + "\n     b- YES !! I can prove my bravery. I'm not a defeatist ! (The Game company isn't responsable if a accidental death occur !)"
                + "\n     Enter the character please :");
        return answerC;
    }
    
    protected static String printbedroom_answerCa() {
        String answerCa = ("It's a choice like a other. Go explore new universe !!!");
        return answerCa;
    }
    
    protected static String printbedroom_answerCb() {
        String answerCb = ("It's so incredible fantastical unbelievable AMAZING!!! You successfuly perform to climb the librairy but at the last shelf you dropped a book."
                + "\n This book doesn't look like a common book. Its covered in dust. The front cover represent a head's cat. You decid to back down."
                + "\n The mysterious book is opening in front of you. Its is surprinsing what you find inside ... "
                + "\n All words, sentences and pictures are understandable. And you're discovering amazing story about cats."
                + "\n << Once upon a time, from down the Marianne's Abysses to the top of Mt Everest, the ancient Cat race was known to be wise and powerful."
                + "\n    Theirs radiance used to spread on the whole world. [...]"
                + "\n    One day a young kitten will come and will be the new leader of a new age. His mission is to bring back the Cat empire at this optimal expansion !"
                + "\n    But a essential artefact is necessary to do that : the legendary guillotine. Its bring back the power to all cats !!! >> "
                + "\n At the end of this book you notice a old post-it which make reference to a fat cat with lot of knowledge. This post-it is signed by a cat paw and a little sentence :"
                + "\n << I will destroy the world as promice dad ! >>"
                + "\n"
                + "\n Are you enought honnest and nice to be this little kitten ?"
                + "\n However this ! You must defend and re-establish the cat world and protect his again his destruction by this mysterious cat !!!");
        return answerCb;
    }
    
    protected static String printbedroom_answerD (){
        String answerD = ("You're taking a snap. Nothing else happen. Let's go explore news horizons !");
        return answerD;
    }
}
