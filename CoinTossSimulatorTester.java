package Coin;

//Name: Ning Nie
//USC NetID: nnie
//CS 455 PA1
//Spring 2022


/**
   The coin toss simulator testing class, which is used for test the CoinTossSimulator class only.
*/  
public class CoinTossSimulatorTester{

public static void main(String[] args){
   CoinTossSimulator tossSample = new CoinTossSimulator();
   System.out.println("After constructor: ");
   System.out.println("Number of trials [exp:0]: " + tossSample.getNumTrials());
   System.out.println("Two-head tosses: " + tossSample.getTwoHeads());
   System.out.println("Two-tail tosses: " + tossSample.getTwoTails());
   System.out.println("One-head one-tail tosses: " + tossSample.getHeadTails());
   if (tossSample.getNumTrials() == 0){
      System.out.println("Tosses add up correctly? true");
   }else{
      System.out.println("Tosses add up correctly? false");
   }
   
   /**
   Run the toss simulation for number of 1.
   */  
   tossSample.run(1);
   System.out.println("After run(1): ");
   System.out.println("Number of trials [exp:1]: " + tossSample.getNumTrials());
   System.out.println("Two-head tosses: " + tossSample.getTwoHeads());
   System.out.println("Two-tail tosses: " + tossSample.getTwoTails());
   System.out.println("One-head one-tail tosses: " + tossSample.getHeadTails());
   if (tossSample.getNumTrials() == 1){
      System.out.println("Tosses add up correctly? true");
   }else{
      System.out.println("Tosses add up correctly? false");
   }
   
   /**
   Add the toss simulation for number of 10, now the total number of trials is 11.
   */       
   tossSample.run(10);
   System.out.println("After run(10): ");
   System.out.println("Number of trials [exp:11]: " + tossSample.getNumTrials());
   System.out.println("Two-head tosses: " + tossSample.getTwoHeads());
   System.out.println("Two-tail tosses: " + tossSample.getTwoTails());
   System.out.println("One-head one-tail tosses: " + tossSample.getHeadTails());
   if (tossSample.getNumTrials() == 11){
      System.out.println("Tosses add up correctly? true");
   }else{
      System.out.println("Tosses add up correctly? false");
   }
   /**
   Add the toss simulation for number of 100, now the total number of trials is 111.
   */        
   tossSample.run(100);
   System.out.println("After run(100): ");
   System.out.println("Number of trials [exp:111]: " + tossSample.getNumTrials());
   System.out.println("Two-head tosses: " + tossSample.getTwoHeads());
   System.out.println("Two-tail tosses: " + tossSample.getTwoTails());
   System.out.println("One-head one-tail tosses: " + tossSample.getHeadTails());
   if (tossSample.getNumTrials() == 111){
      System.out.println("Tosses add up correctly? true");
   }else{
      System.out.println("Tosses add up correctly? false");
   }
   /**
   Add the toss simulation for number of 2000, now the total number of trials is 2111.
   */        
   tossSample.run(2000);
   System.out.println("After run(2000): ");
   System.out.println("Number of trials [exp:2111]: " + tossSample.getNumTrials());
   System.out.println("Two-head tosses: " + tossSample.getTwoHeads());
   System.out.println("Two-tail tosses: " + tossSample.getTwoTails());
   System.out.println("One-head one-tail tosses: " + tossSample.getHeadTails());
   if (tossSample.getNumTrials() == 2111){
      System.out.println("Tosses add up correctly? true");
   }else{
      System.out.println("Tosses add up correctly? false");
   }
   /**
   Reset the number of trials, which make each number of three conditions zero.
   */        
   tossSample.reset();
   System.out.println("Number of trials [exp:0]: " + tossSample.getNumTrials());
   System.out.println("Two-head tosses: " + tossSample.getTwoHeads());
   System.out.println("Two-tail tosses: " + tossSample.getTwoTails());
   System.out.println("One-head one-tail tosses: " + tossSample.getHeadTails());
   if (tossSample.getNumTrials() == 0){
      System.out.println("Tosses add up correctly? true");
   }else{
      System.out.println("Tosses add up correctly? false");
   }
   /**
   Run the toss simulation for number of 1000.
   */        
   tossSample.run(1000);
   System.out.println("After run(1000): ");
   System.out.println("Number of trials [exp:1000]: " + tossSample.getNumTrials());
   System.out.println("Two-head tosses: " + tossSample.getTwoHeads());
   System.out.println("Two-tail tosses: " + tossSample.getTwoTails());
   System.out.println("One-head one-tail tosses: " + tossSample.getHeadTails());
   if (tossSample.getNumTrials() == 1000){
      System.out.println("Tosses add up correctly? true");
   }else{
      System.out.println("Tosses add up correctly? false");
   }
   /**
   Add the toss simulation for number of 2, now the total number of trials is 1002.
   */        
   tossSample.run(2);
   System.out.println("After run(2): ");
   System.out.println("Number of trials [exp:1002]: " + tossSample.getNumTrials());
   System.out.println("Two-head tosses: " + tossSample.getTwoHeads());
   System.out.println("Two-tail tosses: " + tossSample.getTwoTails());
   System.out.println("One-head one-tail tosses: " + tossSample.getHeadTails());
   if (tossSample.getNumTrials() == 1002){
      System.out.println("Tosses add up correctly? true");
   }else{
      System.out.println("Tosses add up correctly? false");
   }
}
}