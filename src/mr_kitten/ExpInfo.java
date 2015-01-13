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
}
