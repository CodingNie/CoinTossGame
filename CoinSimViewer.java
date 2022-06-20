package Coin;


// Name: Ning Nie
// USC NetID: nnie
// CS 455 PA1
// Spring 2022

import java.util.Scanner;
import javax.swing.JFrame;

   /**
      The Coin simulation viewer class. This is the entrance of the coin toss simulator program.
      This viewer includes an error testing for negative number input.
   */  
public class CoinSimViewer{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the number of trials: ");
      int numTrials = in.nextInt();
      while (numTrials <= 0){
         System.out.println("ERROR: Number entered must be greater than 0.");
         System.out.print("Please enter the number of trials: ");
         numTrials = in.nextInt();
      }
      JFrame frame = new JFrame();
      frame.setTitle("CoinSim");
      frame.setSize(800, 500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      CoinSimComponent component = new CoinSimComponent(numTrials);
      frame.add(component);
      frame.setVisible(true);
   }
}