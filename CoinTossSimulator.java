package Coin;

// Name: Ning Nie
// USC NetID: nnie
// CS 455 PA1
// Spring 2022

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */

import java.util.Random;

public class CoinTossSimulator {
   private int twoHeads;
   private int twoTails;
   private int headTails;
   private int numTrials;


   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {
      this.twoHeads = 0;
      this.twoTails = 0;
      this.headTails = 0;
      this.numTrials = 0;
   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {
      Random random = new Random();
      for (int i = 0; i < numTrials; i++){
         int coin1 = random.nextInt(2);
         int coin2 = random.nextInt(2);
         if (coin1 == 0 && coin2 == 0){
            twoHeads++;
         }else if (coin1 == 1 && coin2 == 1){
            twoTails++;
         }else{
            headTails++;
         }
      }
      this.numTrials = twoHeads + twoTails + headTails;
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       return numTrials; 
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
       return twoHeads; 
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       return twoTails; 
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return headTails; 
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
      twoHeads = 0;
      twoTails = 0;
      headTails = 0;
      numTrials = 0;
   }

}
