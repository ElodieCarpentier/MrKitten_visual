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
        String answerCa = ("It's a choice like another. Go explore new universe !!!");
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
    /**
     * Print of street1
     */
      protected static String printStreet1_intro(){
          String intro = ("You look around you and see a big old cat on the street, coming toward you.\n"
                +"\n He looks friendly and comes near you.\n"
                +"\n You may want to talk to him \n"
                +"\n There is also a garbage can over here, it smells delicious...\n"
                +"\n What do you want to do? \n"
                +"\n    a - talk to the cat\n"
                +"\n    b - explore the garbage can\n"
                +"\n Enter the character please :\n");
          return intro;
      }
      
      protected static String printStreet1_answerA(){
          String answer = Actors.garfieldDialog();
          return answer;
      }
      
      protected static String printStreet1_answerB(){
          String answer =("You found a healing potion! That might be useful...");
          return answer;
      }
      
      /**
       * Print of street 2
       */
      protected static String printStreet2_intro(){
          String intro = ("Here you are! Back in the light!\n"
                  +"\n There is another garbage can! Sounds like you are going to make a good deal again! \n"
                  +"\n Do you want to explore the garbage can? \n"
                  +"\n    a - yes \n"
                  +"\n    b - no \n"
                  +"\n Enter the character please : \n");
            return intro;
      }
      
      protected static String printStreet2_answerA(){
          String answer = ("Uh-Oh! There is already someone in this garbage can! \n"
                  +"\n This stray cat doesn't look soft! \n");
          return answer;
      }
      
      protected static String printStreet2_answerB(){
          String answer = ("Let us hope you will not regret it... \n");
          return answer;
      }
      
      /**
       * Print of sewer
       */
      protected static String printSewer_intro(){
          String intro = ("Look! A wild rat is coming toward you! \n"
                  +" \n It seems you have entered his territory \n ");
          return intro;
      }
      
      protected static String printSewer_conclu(){
          String conclu = ("Congratulations! You have learned a new ability : SuperPiss \n"
                  +"\n You are now able to pee on people in a...deadly way... \n");
          return conclu;
      }
      
      /**
       * Print of petshop
       */
      protected static String printPetshop_intro(){
          String intro = ("A red fish appears! He looks stern... \n"
                  +Actors.redFishDialog()
                  +"\n There is a rat in one of the cages. He looks different from the other rats...wise.\n" 
                  +"\n Do you want to talk to him? \n"
                  +"\n    a - yes \n" 
                  +"\n    b - no \n" 
                  +"\n Enter the character please : \n");
          return intro;
      }
      
      protected static String printPetshop_answerA() {
          String answerA = (Actors.ratatouilleDialog()
                  + "\n Congratulations! You just learned Alchemy! You are now able to craft objects using this principle.");
          return answerA;
      }
      
      protected static String printPetshop_answerB(){
          String answerB = ("Let us hope you will not regret it...");
          return answerB;
      }
      protected static String printPetshop_fight() {
            String fight= ("Sheeiiiiiit! You woke up the tyran of the petshop, the robot cleaner!"
                   + "\n"
                   + Actors.mrRobotDialog());
           return fight;
       }
      protected static String printPetshop_end(){
          String end= ("The robot has dropped a potion. Will you make good use of it?");
          return end;
      }
      
      /**
       * Print of the great descent
       */
      protected static String printgreatdescent_intro(){
          String intro=("A group of dangerous looking sharks is swimming toward you!"
                  + "\n"
                  + Actors.sharkDialog());
          return intro;
      }
      protected static String printgreatdescent_end(){ //pas encore fait, implémenter combat en 1er
          String end= ("You just hit this shark so hard that its jaw just got torn apart from the rest of its body!"
                  + "\n Congratulations! You can now bite your ennemies with this super jaw!");
          return end;
      }
      
      /**
       * Print of Dory
       */
      protected static String printdory_intro(){
          String intro= ("Who dat, who dat? How could you do dat, do dat? There's a surgeon fish over there, how could you know that, know that?"
                  + "\n"
                  + Actors.doryDialog_intro());
          return intro;
      }
      protected static String printdory_answerA(){
          String answerA=("Oh I remember now!! Thank you big guy!"+Actors.doryDialog_good());
          return answerA;
      }
      protected static String printdory_answerB(){
          String answerB=("How romantic is this, give a kiss to Keane for me!");
          return answerB;
      }
      protected static String printdory_answerC(){
          String answerC=("You lost me there man...");
          return answerC;
      }
      protected static String printdory_answerD(){
          String answerD=("You gotta love panckakes...");
          return answerD;
      }
      
//      protected static String printdory_good(){
//          String answergood=(Actors.doryDialog_good());
//          return answergood;
//      }
      
       protected static String printdory_goodanswerA(){
          String answerA=("Never trust somebody that has his underwear on top of his pants!");
          return answerA;
      }
      protected static String printdory_goodanswerB(){
          String answerB=("His attack dealt too much damage to handle...");
          return answerB;
      }
      protected static String printdory_goodanswerC(){
          String answerC=("Soooooo good! You are a true scientist!"+
                  "\n Good job! You just won an ancient artefact!"
                  + "\n You recieved: Artefact of true vision");
          return answerC;
      }
      protected static String printdory_goodanswerD(){
          String answerD=("That hardrive doesn't have anything special...");
          return answerD;
      }
      
//      protected static String printdory_end(){
//          String end=("Good job! You just won an ancient artefact!"
//                  + "\n You recieved: Artefact of true vision");
//          return end;
//      }
      
      /*
      * Print of the fishpalace
      */
      protected static String printfishpalace_intro(){
          String intro=("You just entered the fish palace. It is magnificent and amazing."
                  + "\n The court is waiting for you"
                  + "\n It seems you have been fooled! You are late, and the court has declared you guilty."
                  + "\n The King of the Waterworld, Dark Moule, is standing on a high chair, looking at you with utter contempt."
                  + "\n People are coming! There is no way you are going to let them take your life!"
                  + "\n You demand a trial by combat!"
                  + "\n Against...the King!"
                  + Actors.darkMouleDialog());
          return intro;
      }
      protected static String printfishpalace_question(){
          String question=("Quick! Before the fight begins, you see an algae laying on the ground"
                  + "\n That may be useful! Do you want to pick it?"
                  + "\n     a - yes"
                  + "\n     b - no"
                  + "\n Enter the character please :");
          return question;
      }
      protected static String printfishpalace_answerA(){
          String answerA=("Algae item add in your inventory.");
          return answerA;
      }
      protected static String printfishpalace_answerB(){
          String answerB=("Let us hope you will not regret it...");
          return answerB;
      }
      protected static String printfishpalace_end() {
          String end=("When dying, dark Moule has dropped a blue key. You grab it.");
          return end;
      }
      
      /*
      * Print for the tavern SanRicardo
      */
      protected static String printtavern_intro(){
          String intro=("You see a gorgeous looking cat with red-orange fur."
                  + "\n This badass looking guy looks at you with a surprised look."
                  + Actors.pussInBootsDialog());
          return intro;
      }
      protected static String printtavern_end(){
          String end=("ongratulations! You learned the puppyEyes technique! "
                  + "\n What a great way to soften your ennemies heart, to then deadly strike him!");
          return end;
      }
      
      /*
      * Print for vador
      */
      protected static String printvador_intro(){
          String intro=("Nice neon lights illuminate a dark desk. "
                  + "\n Its looks like the Charlie's pub of the 7th street where the disco is on the floor but that's not relate to this story."
                  + "\n You 're walking in direction of this desk ... suddendly the lights out and the office chair turn over. "
                  + "\n A black man appear !"
                  + "\n"
                  + Actors.vadorDialog_a()
                  + "\n **************"
                  + "\n Would you join this incredible profession ?"
                  + "\n   a - Yes, it appears to be a stable situation for my personnal projects."
                  + "\n   b - NO !! I've no time for this bumf !");
          return intro;
      }
      protected static String printvador_answerA(){
          String answerA=("After many years of hard work and after encounter your wife and produced lot of baby ... "
                  + "\n You died of old age :( R.I.P "
                  + "\n You loose !! GAME OVER !!");
          return answerA;
      }
      protected static String printvador_answerB(){
          String answerB=(Actors.vadorDialog_b());
          return answerB;
      }
      protected static String printvador_end(){
          String end=("That's was a critical hit for this madness. He was not very bright !"
                  + "\n Congratulations! Vador dropped a potion care and his laser saber become a beautiful lasertail for you !"
                  + "\n This badass looking guy looks at you with a surprised look.");
          return end;
      }
      
      /*
      * Print of thcloset
      */
      protected static String printcloset_intro(){
          String intro=("There is big wooden cupboard in front of you."
                  + "\n You approach an feel a fresh gust of wind. What is this?"
                  + "\n You decide to enter the cupboard."
                  + "\n There is a cat here..."
                  + "\n He looks stern."
                  + "\n He is covered in scars and has a nasty look, but apart from that, you two are perfect lookalikes..."
                  + Actors.brotherDialog());
          return intro;
      }
       protected static String printcloset_end(){
          String end=("Wow! You won!"
                  + "\n This was a really serious opponent, you almost died."
                  + "\n Still, it always hurts to have to kill your own brother..."
                  + "\n But the gy deserved it, you could jot let him live. He is too dangerous."
                  + "\n You notice a small door in a corner. What could be hiding in it?");
          return end;
      }
       
       /*
       * Print foe the end
       */
       protected static String printend_intro(){
           String intro=("What is this?! Oh my God..."
                   + "\n The magic guillotine!"
                   + "\n Do you want to use it?"
                   + "\n     a - yes"
                   + "\n     b - no"
                   + "\n Enter the character please:");
           return intro;
       }
       protected static String printend_answerA(){
           String answerA=("Wow! The power of the magic guillotine is real! You just turned into a Nyan Cat!"
                   + "\n Infinite powers aheeeeeaaaaaad!!! Yay!");
           return answerA;
       }
       protected static String printend_answerB(){
           String answerB=("\"Let us hope you will not regret it...");
           return answerB;
       }
}
