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

}
